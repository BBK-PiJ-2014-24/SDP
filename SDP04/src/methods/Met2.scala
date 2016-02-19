package methods

object Met2 {
  
  def isArg1GreaterThanArg2(x: Double, y: Double) : Boolean = {
    if(x>y) true
    else false
  }
  
  def main(args : Array[String]) : Unit ={
    
    val t1 = isArg1GreaterThanArg2(4.1, 4.12)
    println(t1)
    assert(t1 == false, " 4.1 < 4.12")
    
    val t2 = isArg1GreaterThanArg2(2.1, 1.2)
    println(t2)
    assert(t2 == true, "2.1 < 1.2")
    
  }
  
}