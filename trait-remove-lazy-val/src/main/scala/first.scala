trait Foo {
  def x = "HI"
  lazy val y = 1
}
object Main {
  def main(args: Array[String]): Unit =
    println(new Foo {}.x)
}
