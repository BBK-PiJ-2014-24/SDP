package expressions

object Exp1 {
    
  def test1(sky:String, temp:Int) : Boolean = {
    if(sky.equals("sunny") && temp > 80){
      false
    }
    else{
      true
    }
  }
  
  def main(args:Array[String]) : Unit = {
    println(test1("sunny",81));
    println(test1("sunny",65))
  }
  
  
}