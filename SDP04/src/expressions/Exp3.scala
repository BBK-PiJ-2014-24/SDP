package expressions

object Exp3 {
  
  def test3(sky:String, temp: Int) : Boolean = {
    
    if(sky == "sunny" || sky == "partly cloudy") {
      if(temp > 80 || temp < 20)
        true
      else
        false
    } else
      false   
  }
  
  
  def main(args:Array[String]) : Unit = {
    println(test3("sunny", 6))
    println(test3("sunny", 90))
    println(test3("cloudy", 90))
  }
  
}