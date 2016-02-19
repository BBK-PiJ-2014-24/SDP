package expressions

object Exp4 {
  
  val tempF = 61
  
  def fToC(x : Double) : Double = {
     val temp = (x - 32.0) * (5.0/9)
     temp
  }
  
  def main(args : Array[String]){
    println( tempF + "C = tempF " + fToC(tempF) + "F")
  }
  
}