package patternMatching

object VectorForecast {
  
  val sunnyData = Vector(100, 80, 50, 20, 0, 15)
  
  for(v <- sunnyData){
    println(forecast(v));
  }
  
    def forecast(temp: Int): String = {
       
      val ans = temp match {
        case 100 => "Sunny"
        case x if(80 to 99).contains(x) => "Mostly Sunny"
        case x if(50 to 79).contains(x) => "Partly Sunny" 
        case x if(20 to 49).contains(x) => "Mostly Sunny"
        case 0 => "Cloudy"
        case _ => "Unknown"
      } // end match
      ans  
     } //end def
  
}