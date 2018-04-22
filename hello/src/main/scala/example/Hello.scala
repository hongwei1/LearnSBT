package example

object Hello extends Greeting with App {
  val hongweiName = "hongwei"
  println(greeting)
}

// set the string in the `Trait` 
trait Greeting {
  lazy val greeting: String = "hello"
}
