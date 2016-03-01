package traitsInheritance5c

object DrawTest extends App {
  
  import atomicscala.AtomicTest._ 
  
  
			Draw(Circle(3)) is "A circle of radius 3cm"
      Draw(new Rectangle(3, 4)) is "A rectangle of width 3.0cm and height 4.0cm"
      Draw(new Square(3)) is "A square of length 3.0cm"
  
  
  
}