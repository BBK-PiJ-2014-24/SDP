package expressions

object Exp2 {
  
  def test2(sky:String, temp:Int) : Boolean = {
    if(sky == "sunny" || sky == "partly cloudy") {
      if(temp > 80)
        true
      else 
        false
    } 
    else
        false
  }
  
  def main(args:Array[String]) : Unit = {
    println(test2("sunny",81))
    println(test2("cloudy", 81))
  }
  
}