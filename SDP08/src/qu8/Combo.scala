package qu8

object Combo {
  
  def combine(f: (Int,Int) =>Int, a: Int, b: Int, c: Int) = {
             def iter(a: Int, b: Int): Int = {
                  if (a > b) c
                  else f(a, iter(a+1, b))
    
          } 
     iter(a,b) 
  }
}


object testCombines extends App {
  
  import atomicscala.AtomicTest._ 
  
  
   val x3 = Combo.combine((x,y) => x+y, 1, 2, 0)
   println() 
   println(x3)
   val x4 = Combo.combine((x,y) => x*y, 1, 4, 1)
   println() 
   println(x4) 
   //assert(x3 == 6)
     
}