package traitsInheritance5a

class Rectangle(a:Int, b:Int) extends Shape{
  
  val sideLengthA = a
  val sideLengthB = b
  val numSides:Int = 4
  
   def sides() : Int  = {
    numSides
  } 
  
  def perimeter() : Double = {
     (numSides/2 * sideLengthA) + (numSides/2 * sideLengthB);
  }
  
// iii. area returns the area.
  def area() : Double = {
    sideLengthA * sideLengthB
  }
   
}

object Rectangle extends App{

  import atomicscala.AtomicTest._ 
  
  val r =  new Rectangle(3,5)
  
  r.numSides is 4
  r.perimeter is 16
  r.area is 15
}