package traitsInheritance9

object TestSum extends App{
  
 println(Left[Int, String](1).value)
 
 println(Right[Int, String]("foo").value)
 
 val sum: Sum[Int, String] = Right("foo")
  
 
 sum match {
 case Left(x) => x
 case Right(x) => x.toString
 }
 println(sum)
  
}

