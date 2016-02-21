package namedDefaultArgs

class Item(name: String, price: Int)  {
  
  var totalCost:Double = 0.0
  
  def cost(grocery:Boolean = false, medication:Boolean = false, taxRate:Double = 0.1 ) : Double = {
    if(grocery == true || medication == true ) totalCost = price
    else totalCost = price * (1+taxRate)
    totalCost
  }
  
}

