package traitsInheritance6

object divide {
  
  def apply(x:Int, y:Int) : DivisionResult = {
    
    if(y!=0) Finite(x/y)
    else Infinite()
    
  }
  

  
}