package qu14

trait Square {
  
  // Goes through the List and Maps x^2 into new List
  
  def squareList(xs: List[Int]): List[Int] = xs match {
           case List() => List()
           case y :: ys => y*y :: squareList(ys);  
  }
  
  def squareListMap(xs: List[Int]): List[Int] ={
        xs.map( x=> x*x) 
  }
 
}

object testSquare extends App with Square{
  
  val list = List(1,2,3,4,5)
  
  val ans = squareList(list)
  println(ans)
  
  val ansMap = squareListMap(list)
  println(ansMap)
  
}

