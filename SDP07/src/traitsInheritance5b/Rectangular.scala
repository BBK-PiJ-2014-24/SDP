package traitsInheritance5b

abstract class Rectangular(a:Int, b:Int) extends Shape {
  
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