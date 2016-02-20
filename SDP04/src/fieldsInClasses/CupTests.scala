package fieldsInClasses

object CupTests {

import AtomicTest._
  
  def main(args : Array[String]) : Unit = {
    
    val cup = new Cup() 
    cup.add(45) is 45
    cup.add(-55) is 0
    cup.add(10) is 10
    cup.add(-9) is 1
    cup.add(-2) is 0
    
    cup.percentFull = 56
    cup.percentFull is 56
    
    
    
    val cup2 = new Cup()
    cup2.setPercentFull(56)
    cup2.getPercentFull() is 56
  }
  
}