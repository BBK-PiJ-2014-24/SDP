package vector

object vectorREPL {
  println("Welcome to the Scala worksheet")
  
  import scala.collection.immutable._
  
  val vInt = Vector.empty
  val v1 = vInt :+ 3 :+ 2 :+  1
  val v1a = vInt :+ 3 :+ 2
  
  val vDouble = Vector.empty
  val v2 = vDouble :+ 3.0 :+ 2.0 :+ 1.0
  
	val vString = Vector.empty
	val v3 = vString :+ "hello" :+ " Vector"

	val vComb = Vector.empty
	val vComb1 = vComb :+ v1 :+ v1a
  // val vComb3 = vCoomb :+ v1 :+ v3
}