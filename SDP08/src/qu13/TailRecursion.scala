package qu13

object TailRecursion {
  
  
//  // Normal Recursion
//  // ----------------
//  def length(): Int = this match {
//           case Nil => 0
//           case x :: xs => 1 + xs.length
//  }
//  
//  // Tail Recursion
//  // --------------
//  def lengthTR(): Int = {
//      def lengthTRhelper[T](a: Int, list: List[T]): Int = {
//        list match{
//          case Nil => 0
//          case x :: xs => lengthTRhelper(a+1, xs)
//        }
//      }
//      lengthTRhelper(0, this)  
//  }
}