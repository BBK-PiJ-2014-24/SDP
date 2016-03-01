package traitsInheritance6

//Create an object called divide with an apply method that accepts two Ints and 
//re- turns DivisionResult. DivisionResult should be a 
//sealed trait with two subtypes: a Finite type encapsulating the result of a valid division, 
//and an Infinite type representing the result of dividing by 0.
//Here are some examples:
//  scala> divide(1, 2)
//  res7: DivisionResult = Finite(0)

sealed trait DivisionResult {
 
}

case class Finite(x:Int) extends DivisionResult {

}

case class Infinite() extends DivisionResult{
  
}


//sealed trait DivisionResult {
//  
//}
//
//case class Finite(result: Int) extends DivisionResult {
//    
//}
//
//case object Infinite extends DivisionResult {
//  
//}
//
