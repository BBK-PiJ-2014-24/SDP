package traitsInheritance8a

sealed trait LinkedList[A] {
 def head: A
 def tail: LinkedList[A] 
}

case class Pair[A](val head:A, t:LinkedList[A]) extends LinkedList[A]{
  
  // head called via the parameter list
  def tail: LinkedList[A] = t

}

case class Empty[A]() extends LinkedList[A]{
  def head:Nothing = throw new Exception()
  def tail:Nothing = throw new Exception()
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