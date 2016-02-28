package traitsInheritance5b

class Rectangle(a:Int, b:Int) extends Rectangular(a,b){
    
}

object Rectangle extends App{

  import atomicscala.AtomicTest._ 
  
  val r =  new Rectangle(3,5)
  
  r.numSides is 4
  r.perimeter is 16
  r.area is 15
}