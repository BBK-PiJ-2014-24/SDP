package traitsInheritance5a

class Square(sideLength : Int) extends Shape{
  
  val sqSideLength = sideLength
  val numSides:Int = 4
  
  def sides() : Int  = {
    numSides
  } 
  
  def perimeter() : Double = {
     numSides * sqSideLength;
  }
  
// iii. area returns the area.
  def area() : Double = {
    sideLength * sqSideLength
  } 
}


object Square extends App {
  
  import atomicscala.AtomicTest._ 
  
  val s =  new Square(3)
  
  s.numSides is 4
  s.perimeter() is 12
  s.area is 9
  
  
}