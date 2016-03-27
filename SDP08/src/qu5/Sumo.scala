package qu5

object Sumo {
  
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
          def iter(a: Int, result: Int): Int = {
                  if (a > b) 0
                  else f(a + iter(a+1, b)); 
          }
          iter(a, b) 
  }
}

object testSumo extends App {
  
  import atomicscala.AtomicTest._ 
  
  
   val x3 = Sumo.sum(x=> x+2)(1, 3)
   println(x3)    
   assert(x3 == 12)
     
}