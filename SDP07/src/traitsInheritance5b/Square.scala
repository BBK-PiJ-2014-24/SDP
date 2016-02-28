package traitsInheritance5b

class Square(a:Int) extends Rectangular(a,a){
  
}


object Square extends App {
  
  import atomicscala.AtomicTest._ 
  
  val s =  new Square(3)
  
  s.numSides is 4
  s.perimeter() is 12
  s.area is 9
  
  
}