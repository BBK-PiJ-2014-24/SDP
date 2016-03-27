package qu04

object Factor {
  
  def factorial(n: Int): Int = {
    n match{
      case 1 => 1
      case _ => n*factorial(n-1)
    }
  }
  
}

object testFactorial extends App {
  
  import atomicscala.AtomicTest._ 
  
   val x3 = Factor.factorial(2);
     assert(Factor.factorial(2) == 2)
     assert(Factor.factorial(5) == 120)
}

