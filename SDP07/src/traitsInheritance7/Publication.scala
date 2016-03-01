package traitsInheritance7

sealed trait Publication {
  
}

case class Book(a : String) extends Publication with Manuscript{
  
  val author = a
}

case class Periodical(e : String, v : Int, series:Seq[Manuscript]) extends Publication{
  
  val editor : String = e
  val volume : Int = v
  val manuSeries : Seq[Manuscript] = series
  
  
}


