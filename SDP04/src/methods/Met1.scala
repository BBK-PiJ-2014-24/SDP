package methods

object Met1 {
  
  def getSquare(x : Int) = {x*x}
  
  def main(args : Array[String]) : Unit = {
     val a = getSquare(3)
     println(a)
     assert( 9 == a, "getSquare(3) = 9" )
     
     val b = getSquare(6)
     println(b)
     assert( 36 == b, "getSquare(6) = 36" )
     
     val c = getSquare(5)
     println(c)
     assert( 25 == c, "getSquare(25) = 5" )
     
  }
  
}