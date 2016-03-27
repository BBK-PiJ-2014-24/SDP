package qu7

object Facto2 {
  
  def product(a: Int, b: Int): Int ={
    def iter(a: Int, result: Int): Int = {
        if (a > b)  1
        else a * product(a+1, b) 
    }
    iter(a,b)  
  }
 
  
  def factorial(n:Int): Int = {
    product(1,n)
  }  
}

object testFactorial extends App {
  
  import atomicscala.AtomicTest._ 
  
   val x3 = Facto2.factorial(2);
     assert(Facto2.factorial(2) == 2)
     assert(Facto2.factorial(5) == 120)
}