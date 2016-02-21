package patternMatching

object MyForecastTest {
 
   import atomicscala.AtomicTest._
   object MyForecastTest extends App {
     forecast(100) is "Sunny"
     forecast(80) is "Mostly Sunny"
     forecast(50) is "Partly Sunny"
     forecast(20) is "Mostly Sunny"
     forecast(0) is "Cloudy"
     forecast(-15) is "Unknown"
    
     
     def forecast(temp: Int): String = {
       
      temp match {
        case 100 => "Sunny"
        case x if(80 to 99).contains(x) => "Mostly Sunny"
        case x if(50 to 79).contains(x) => "Partly Sunny" 
        case x if(20 to 49).contains(x) => "Mostly Sunny"
        case 0 => "Cloudy"
        case _ => "Unknown"
      }
       
     }}
  
  
  
}