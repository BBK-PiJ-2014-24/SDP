package traitsInheritance5e

sealed trait Shape {
  
  var c : Colour = new RedColour()
  
  def sides() : Int   
  def perimeter() : Double
  def area() : Double
  
  def getColour() : Colour = c
  
  def changeColour(newC:Colour) : Unit = {
    this.c = newC
  }
  
}

class Square(x : Double) extends Shape with Rectangular {
  override val sideLengthA = x   // Note that a val field needs to be Override
  var sideLengthB = x            // Note that a var does not need to be Override
}

object Square {
  def apply(x: Double)  = new Square(x);
}

class Rectangle(x : Double, y : Double) extends Shape with Rectangular{
   override val sideLengthA = x
   var sideLengthB = y
}

object Rectangle {
  def apply(x: Double, y:Double)  = new Rectangle(x,y);
}

class Circle(rad : Int) extends Shape {
  val r:Int = rad
   val numSides:Int = 1
  
  def sides() : Int  = numSides
  
  def perimeter() : Double = {
     2 * Math.PI * r
  }

  def area() : Double = {
    Math.PI * (r *r)
  }
}

object Circle {
  def apply(rad: Int) = new Circle(rad)
}



object CircleTest extends App {
  
  import atomicscala.AtomicTest._ 
  
  val c =  new Circle(3)
  
  c.numSides is 1
  c.perimeter() is 18.84955592153876
  c.area is 28.274333882308138
  
  val s = new Square(3)
  s.area is 9
}





     
  