package vector

object vectorREPL {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  import scala.collection.immutable._
  import vector.AtomicTest._
  
  
  val vInt = Vector.empty                         //> vInt  : scala.collection.immutable.Vector[Nothing] = Vector()
  val v1 = vInt :+ 3 :+ 2 :+  1                   //> v1  : scala.collection.immutable.Vector[Int] = Vector(3, 2, 1)
  val v1a = vInt :+ 3 :+ 2                        //> v1a  : scala.collection.immutable.Vector[Int] = Vector(3, 2)
  
  val vDouble = Vector.empty                      //> vDouble  : scala.collection.immutable.Vector[Nothing] = Vector()
  val v2 = vDouble :+ 3.0 :+ 2.0 :+ 1.0           //> v2  : scala.collection.immutable.Vector[Double] = Vector(3.0, 2.0, 1.0)
  
	val vString = Vector.empty                //> vString  : scala.collection.immutable.Vector[Nothing] = Vector()
	val v3 = vString :+ "hello" :+ " Vector"  //> v3  : scala.collection.immutable.Vector[String] = Vector(hello, " Vector")

	val vComb = Vector.empty                  //> vComb  : scala.collection.immutable.Vector[Nothing] = Vector()
	val vComb1 = vComb :+ v1 :+ v1a           //> vComb1  : scala.collection.immutable.Vector[scala.collection.immutable.Vecto
                                                  //| r[Int]] = Vector(Vector(3, 2, 1), Vector(3, 2))
  // val vComb3 = vCoomb :+ v1 :+ v3
  
  
  
  val myList = List("The", "dog", "visited", "the", "fire", "station")
                                                  //> myList  : List[String] = List(The, dog, visited, the, fire, station)
  val vSentence = Vector.empty                    //> vSentence  : scala.collection.immutable.Vector[Nothing] = Vector()
  val vSentence2 = vSentence ++ myList            //> vSentence2  : scala.collection.immutable.Vector[String] = Vector(The, dog, v
                                                  //| isited, the, fire, station)
   
  var s = ""                                      //> s  : String = ""
  for(i <- vSentence2){
  	s+= i + " "
  }
  println(s)                                      //> The dog visited the fire station 
 // assert("The dog visited the fire station ", s )
 
 
 
 var x = v1.sum                                   //> x  : Int = 6
 var y = v1.max                                   //> y  : Int = 3
 var z = v1.min                                   //> z  : Int = 1
 
 var a = v2.sum                                   //> a  : Double = 6.0
 var b = v2.max                                   //> b  : Double = 3.0
 var c = v2.min                                   //> c  : Double = 1.0
 
 
 val vt1 = Vector(1,2,3,4,5,6)                    //> vt1  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5, 6)
 val vt2 = Vector(1,2,3,4,5,6)                    //> vt2  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4, 5, 6)
 
 vt1 == vt2 is true                               //> true
}