package traitsInheritance9

sealed trait Sum[A,B] {
 
}

case class Left[A,B](val l:A) extends Sum[A,B]{
  def value() = l
}

case class Right[A,B](val r:B) extends Sum[A,B]{
  def value() = r
}