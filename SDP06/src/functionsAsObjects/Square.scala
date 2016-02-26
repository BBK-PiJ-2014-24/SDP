package functionsAsObjects

object Square extends App {
  
  import atomicscala.AtomicTest._ 
  
  var sq = {x:Int => x* x}
  
  var s = ""
   val numbers = Vector(1, 2, 5, 3, 7)
   numbers.foreach( s+= sq(_).toString() + " ")
   s is "1 4 25 9 49"
  
}