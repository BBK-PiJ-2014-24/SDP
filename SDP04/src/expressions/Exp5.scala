package expressions

object Exp5 {
    
  val tempF = 16.1
  
  def cToF(x : Double) : Double = {
     val temp = (x / (5.0/9)) + 32.0
     temp
  }
  
  def main(args : Array[String]){
    println( tempF + "C = tempF " + cToF(tempF) + "F")
  }
  
}