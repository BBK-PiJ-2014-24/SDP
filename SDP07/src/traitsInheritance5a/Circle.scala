package traitsInheritance5a

class Circle(rad : Int) extends Shape{
  
   val r:Int = rad
   val numSides:Int = 1
  
   def sides() : Int  = {
    numSides
  } 
  
  def perimeter() : Double = {
     2 * Math.PI * r
  }
  
// iii. area returns the area.
  def area() : Double = {
    Math.PI * (r *r)
  }
  
  
}

object Circle extends App {
  
  import atomicscala.AtomicTest._ 
  
  val s =  new Circle(3)
  
  s.numSides is 1
  s.perimeter() is 18.84955592153876
  s.area is 28.274333882308138
  
  
}