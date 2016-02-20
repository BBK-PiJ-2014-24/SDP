package creatingClasses

object CC {
    def main(args : Array[String]){
    
    val h = new Hippo()
    val l = new Lion()
    val t = new Tiger()
    val m = new Monkey()
    val g = new Giraffe()
    
    println("The Hippo: " + h)
    println("The Lion: " + l)
    println("The Tiger: " + t)
    println("The Monkey: " + m)
    println("The Giraffe: " + g)
    
    val l2 = new Lion()
    val g2 = new Giraffe()
    val g3 = new Giraffe()
    println("\nThe Lion2: " + l2)
    println("The Giraffe2: " + g2)
    println("The Giraffe3: " + g3)
    
    println("objects are stored in diff locations")
    
    
    
  }
}