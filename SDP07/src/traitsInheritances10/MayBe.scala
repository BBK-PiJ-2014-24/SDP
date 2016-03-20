package traitsInheritances10

sealed trait MayBe {
  
}

//case class Full[T](val x:T) extends MayBe {
//  
//  def divideBy(y:T) :T = {
//    y match {
//      case i:Int => x/y
//    }
//    
//  }
//
//}

//case class Empty() extends MayBe{
  
//}