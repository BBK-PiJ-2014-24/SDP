package functionsAsObjects

object DogsLife extends App {
  
  import atomicscala.AtomicTest._ 
  
  
  val dogYears = {x:Int => 7*x}
  dogYears(10) is 70
  
  
  
   var s = ""
   val v = Vector(1, 5, 7, 8)
   v.foreach(s += dogYears(_).toString() + " ")
   s is "7 35 49 56 "
  
}