package traitsInheritance8b

sealed trait LinkedList[A] {
 def head: A
 def tail: LinkedList[A] 
 
 def length(h: A, t: LinkedList[A]): Int
 def apply(n: Int, h:A, t: LinkedList[A]) : A
 def contains(a:A, h:A, t: LinkedList[A]) : Boolean
 
}

case class Pair[A](val head:A, t:LinkedList[A]) extends LinkedList[A]{
  
  // head called via the parameter list
  def tail: LinkedList[A] = t
  
  // length()
  def length(h: A, t: LinkedList[A]) : Int = {
    //if(t == Empty()) 1
    //else length(t.head, t.tail) + 1
    t match{
      case e: Empty[A] => 1
      case t: LinkedList[A] => length(t.head,t.tail) + 1
    }
  }
  
  // apply
  def apply(n:Int, h:A, t: LinkedList[A]) : A = {
    
  //  if(t.head==Empty()) throw new Exception("Overrun!!")
  //  if(n == 1) h
  //  else apply(n-1, t.head, t.tail)
    
    t match {
      case e: Empty[A] => if(n==1) h else throw new Exception("Overrun!!")
      case l: LinkedList[A] => if(n==1) h else apply(n-1, t.head, t.tail)
    }
      
  }
  
  // contains()
  def contains(a:A, h:A, t: LinkedList[A]) : Boolean = {
    
    t match {
      case e : Empty[A] => if(h == a) true else false
      case l : LinkedList[A] => if(h == a) true else contains(a, t.head, t.tail)
    }    
  }
  
  

}

case class Empty[A]() extends LinkedList[A]{
  def head = null.asInstanceOf[A]
  def tail = null.asInstanceOf[LinkedList[A]]
  def length(h: A, t: LinkedList[A]) : Int = 0
  def apply(n: Int, h:A, t: LinkedList[A]) : A = throw new Exception()
  def contains(a:A, h:A, t: LinkedList[A]) : Boolean = false
}

// To implement a LinkedList in Scala we need to combine our knowledge of generic types with our 
// existing knowledge of sealed traits. We can define a linked list as a sealed trait LinkedList[A]
// with two subtypes:
//•
//
//a class Pair[A] with two fields, head and tail: – head is the item at this position in the list;
//– tail is another LinkedList[A] –– either another Pair or an Empty; a class Empty[A] with no fields.
//Start by writing the simplest trait and classes you can so that you can build a list. 
// You should be able to use your implementation as follows:
//val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
//list.isInstanceOf[LinkedList[Int]] // returns true
//list.head      // returns 1 as an Int
//list.tail.head // returns 2 as an Int
//list.tail.tail // returns Pair(3, Empty()) as a LinkedList[Int]
//[Yes, this is very similar to the example from class.]