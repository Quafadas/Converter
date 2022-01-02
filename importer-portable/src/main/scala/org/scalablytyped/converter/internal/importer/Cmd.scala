package org.scalablytyped.converter.internal
package importer

import ammonite.ops.{Command, CommandResult, Shellout, ShelloutException}
import com.olvind.logging.Logger

class Cmd(logger: Logger[_], maxLengthOpt: Option[Int], env: Map[String, String] = Map.empty) {
  def env(key: String, value: String): Cmd = new Cmd(logger, maxLengthOpt, env.updated(key, value))

  val runVerbose = Command(Vector.empty, env, executeStream(verbose = true))
  val run        = Command(Vector.empty, env, executeStream(verbose = false))

  private val MaxLength = maxLengthOpt.getOrElse(Int.MaxValue)

  def executeStream(verbose: Boolean)(wd: os.Path, cmd: Command[_]): CommandResult = {
    lazy val cmdStr = s"'$wd: ${cmd.cmd.mkString(" ")}'" match {
      case tooLong if tooLong.length > MaxLength => tooLong.take(MaxLength - 3) + "..."
      case other                                 => other
    }

    if (verbose) {
      logger.warn(cmdStr)
    }

    try {
      val res = Shellout.executeStream(wd, cmd)
      res
    } catch {
      case ex: ShelloutException =>
        logger.error(s"$cmdStr ${ex.result}")
        throw ex
    }
  }
}
