package traitsInheritance5c

trait Rectangular {
    
  val sideLengthA : Double
  var sideLengthB : Double
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