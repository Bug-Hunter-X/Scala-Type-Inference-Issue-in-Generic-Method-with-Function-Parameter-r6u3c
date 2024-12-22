```scala
class MyClass[T](val value: T) {
  def myMethod(f: T => String): String = {
    f(value)
  }
}

object Main extends App {
  val myInt = new MyClass(10)
  val myString = new MyClass("Hello")

  println(myInt.myMethod(x => x.toString))
  println(myString.myMethod(_.toUpperCase))
}
```