final class Foo(val value: Int)

object Foo {
  transparent def unapply(foo: Foo): Some[Int] = Some(foo.value)
}

object Test {
  def transformTree(f: Foo): Any = f match {
    case Foo(_) => ???
  }
}
