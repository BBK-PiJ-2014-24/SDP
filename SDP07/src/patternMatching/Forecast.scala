package patternMatching

object Forecast {
  
  
  import src.atomicscala.AtomicTest._
  
  def forecast(howCloudy : Int) : String ={
    
   
    val ans = howCloudy match{
      case 100 => "Sunny"
      case x if (80 to 99).contains(x) => "Mostly Sunny"
      case x if (50 to 79).contains(x) => "Partly Sunny" 
      case x if (20 to 49).contains(x) => "Mostly Sunny"  
      case 0 => "Cloudy"
      case _ => "Incorrect Entry"
    }
    ans
  }
  
  def main(args : Array[String]) : Unit = {
    println(forecast(82))
  }
  
  
  
}