package traitsInheritance8b

object TestLists extends App{
  
  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
  println(list.isInstanceOf[LinkedList[Int]]) // returns true
  
  println(list.head)     // returns 1 as an Int
  println(list.tail.head) // returns 2 as an Int
  println(list.tail.tail) // returns Pair(3, Empty()) as a LinkedList[Int]
  println(list.tail.tail.tail)  // null
  
  println(list.length(list.head, list.tail))
  println(list.apply(3,list.head, list.tail))
  println()
  
 println(list.contains(3,list.head, list.tail))
 println(list.contains(10,list.head, list.tail))
  
}