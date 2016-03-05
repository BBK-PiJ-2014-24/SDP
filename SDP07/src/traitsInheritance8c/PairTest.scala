package traitsInheritance8c

object PairTest extends App{
  
  val pair = Pair[String, Int]("hi", 2)
  
  println(pair.one)
  println(pair.two)
  
}