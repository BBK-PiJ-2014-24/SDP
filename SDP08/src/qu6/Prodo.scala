package qu6

object Prodo {
  
  def product(a: Int, b: Int): Int ={
    def iter(a: Int, result: Int): Int = {
        if (a > b)  1
        else a * product(a+1, b) 
    }
    iter(a,b)  
  }
  
}

object testProd extends App {
  
  import atomicscala.AtomicTest._ 
  
  
   val x3 = Prodo.product(1,3)
   println(x3)    
   assert(x3 == 6)
     
}