package qu01

trait IntList { 
  final case class Pair(head: Int, tail: IntList) extends IntList
  final case object End extends IntList
}