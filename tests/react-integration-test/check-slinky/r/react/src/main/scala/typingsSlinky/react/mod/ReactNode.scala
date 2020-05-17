package typingsSlinky.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.ReactChild
  - typingsSlinky.react.mod.ReactFragment
  - typingsSlinky.react.mod.ReactPortal
  - scala.Boolean
  - js.UndefOr[scala.Nothing]
*/
trait ReactNode extends js.Object

object ReactNode {
  @scala.inline
  implicit def apply(value: Boolean): slinky.core.facade.ReactElement = value.asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  implicit def apply(value: Double): slinky.core.facade.ReactElement = value.asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  implicit def apply(value: js.Object): slinky.core.facade.ReactElement = value.asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  implicit def apply(value: slinky.core.facade.ReactElement): slinky.core.facade.ReactElement = value.asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  implicit def apply(value: ReactNodeArray): slinky.core.facade.ReactElement = value.asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  implicit def apply(value: ReactPortal): slinky.core.facade.ReactElement = value.asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  implicit def apply(value: String): slinky.core.facade.ReactElement = value.asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => slinky.core.facade.ReactElement): slinky.core.facade.ReactElement = value.map(ev).asInstanceOf[T]
}

