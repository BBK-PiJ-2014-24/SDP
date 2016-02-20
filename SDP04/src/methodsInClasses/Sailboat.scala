package methodsInClasses

class Sailboat {
  
  def raiseSails() : Unit ={
    println("Raisin' the sails, captain!")
  }
  
  def lowerSails() : Unit ={
    println("Lowerin' the sails, captain!")
  }
  
  def signal() : Unit ={
    val f = new Flare
    f.light();
  }
  
}