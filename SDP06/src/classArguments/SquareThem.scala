package classArguments

object SquareThem extends App {
 
  import atomicscala.AtomicTest._
  
    squareThem(2) is 4
    squareThem(2, 4) is 20
    squareThem(1, 2, 4) is 21
    
  
  def squareThem( x : Int*) : Int = {
    var sum : Int = 0
    for (i <- x){
      sum = sum +  (i*i)
    }
    //println("The ans: " + sum)
    sum
  }
  


  
  
}