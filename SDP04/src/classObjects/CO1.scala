package classObjects

object CO1 {
  def main(args : Array[String]){
    
    val r1 = 0 to 10
    val r2 = 0 to 10 by 2
    
    
    println("range 0:10")
    for(i <- r1) println(i)
    
    println("range 0:2:10")
    for(i <- r2) println(i)
    
  }
}