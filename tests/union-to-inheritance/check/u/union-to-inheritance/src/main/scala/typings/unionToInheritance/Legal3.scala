package typings.unionToInheritance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.unionToInheritance.unionToInheritanceStrings.foo
  - typings.unionToInheritance.unionToInheritanceStrings.bar
  - typings.unionToInheritance.Foo[T3]
  - typings.unionToInheritance.Either[T2, T3]
  - typings.unionToInheritance.Foo2[T1, T3]
*/
trait Legal3[T1, T2, T3] extends js.Object

object Legal3 {
  @scala.inline
  def foo[T1, T2, T3]: typings.unionToInheritance.unionToInheritanceStrings.foo = "foo".asInstanceOf[typings.unionToInheritance.unionToInheritanceStrings.foo]
  @scala.inline
  def bar[T1, T2, T3]: typings.unionToInheritance.unionToInheritanceStrings.bar = "bar".asInstanceOf[typings.unionToInheritance.unionToInheritanceStrings.bar]
  @scala.inline
  implicit def apply[T1, T2, T3](value: Either[T2, T3]): Legal3[T1, T2, T3] = value.asInstanceOf[Legal3[T1, T2, T3]]
  @scala.inline
  implicit def apply[T1, T2, T3](value: Foo[T3]): Legal3[T1, T2, T3] = value.asInstanceOf[Legal3[T1, T2, T3]]
  @scala.inline
  implicit def apply[T1, T2, T3](value: Foo2[T1, T3]): Legal3[T1, T2, T3] = value.asInstanceOf[Legal3[T1, T2, T3]]
}

