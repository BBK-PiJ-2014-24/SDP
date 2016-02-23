package constructors

class Tea(name:String = "Earl Grey", decaf:Boolean = false, milk:Boolean = false, sugar:Boolean =false) {
  
  

  
  def describe() : String = {
   var s:String = name
      if(decaf) s =  s + " decaf"
      if(milk) s = s  + " + milk"
      if(sugar) s = s + " + sugar"
        
      s     
    }
    
  
  
  def calories() : Int = {
    val pair = (milk, sugar)
    pair match{ 
      case (true, true) => 116
      case (true, false) => 100
      case (false, true) => 16
      case (false, false) => 0
    }
  }
  
  
}

//describe — which includes information about whether the tea includes milk, sugar,
//is decaffeinated, and includes the name; and
//calories — which adds 100 calories for milk and 16 calories for sugar.
// Satisfy the following tests:



