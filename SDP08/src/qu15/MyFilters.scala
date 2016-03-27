//package qu15
//
trait List[+A]{

case class Cons[+A](val head: A, val tail: List[A]) extends List[A]
case object Nil extends List[Nothing]
}

trait MyFilters[+A]{
 
//  
//    def filter(p: A => Boolean): List[A] = this match {
//           case Nil => this
//           case x :: xs => if (p(x)) x :: xs.filter(p) else xs.filter(p)
//    }
//    
//   def forall(p: A => Boolean): Boolean = {
//           isEmpty || (p(head) && (tail forall p))
//   }
//   
//   
//   def exists(p: A => Boolean): Boolean = {
//           !isEmpty && (p(head) || (tail exists p))
//   }
//  
//  
}
//
//object ListMain extends App {
////  
// 
//  // val xs = List(1, 2, 3, 4, 5)
//     val xs = List(1, 2, 3, 4, 5, 0)
//     
//     
//     def forall[A](p: A => Boolean)(xs: List[A]): Boolean = {
//       def filter[A](p: A => Boolean)(xs: List[A]): List[A] = xs match {
//         case Nil => Nil
//         case y :: ys =>
//           if (p(y)) y :: ys.filter(p)
//           else Nil }
//       // filter(p)(xs).length > 0
//       filter(p)(xs).length == xs.length  // Run until filter length has gone through the whole length of list
//     }
//     
//     
//     def exists[A](p: A => Boolean)(xs: List[A]): Boolean = {
//       def filter[A](p: A => Boolean)(xs: List[A]): List[A] = xs match {
//         case Nil => xs
//         case y :: ys =>
//           if (p(y)) {  List(y) }// found; no need for further recursion
//           else ys.filter(p)
//       }
//       filter(p)(xs).length > 0  // 
//     }
//     
//     
//     assert(exists[Int](x => x > 3)(xs))
//     assert(!exists[Int](x => x < 0)(xs))
//     // assert(forall[Int](x => x > 0)(xs))
//     assert(forall[Int](x => x >= 0)(xs))
//     assert(!forall[Int](x => x > 3)(xs))
//}