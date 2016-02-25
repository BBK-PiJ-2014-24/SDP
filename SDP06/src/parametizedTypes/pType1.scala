package parametizedTypes

object pType1 extends App {
  
   import atomicscala.AtomicTest._
   
   // Return type is inferred:
   def inferred(c1: Char, c2: Char, c3: Char) = {
     Vector(c1, c2, c3)
   }
   
   // Explicit return type:
   def explicit(c1: Char, c2: Char, c3: Char) : Vector[Char] = {
     Vector(c1, c2, c3)
   }
   
   inferred('a', 'b', 'c') is "Vector(a, b, c)"
   explicit('a', 'b', 'c') is "Vector(a, b, c)"
   
   
   def explicitDouble(x1:Double, x2:Double, x3:Double) : Vector[Double] = {
     Vector(x1, x2, x3)
   }
   
   explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)
   
   def explicitList[T](v1:Vector[T]) :  List[T] = {
     v1.toList
   }
  
   explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
   explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)
   
  
   def explicitSet[T](v1:Vector[T]) : Set[T] = {
     v1.toSet
   }
  
   explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
   explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)
   
   
   def explicitString(v1: Vector[Int]) : String = {
       var s : String = ""
       for(v <- v1){
         s += v + ","
       }
       s
   }
   
   val str = explicitString(Vector(1,2,3,4))
   str is "1,2,3,4,"
}