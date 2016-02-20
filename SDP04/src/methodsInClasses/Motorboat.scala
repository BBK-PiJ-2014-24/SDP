package methodsInClasses

class Motorboat {
  
  def on() : Unit = {
    println("Start Motor")
  }
  
  def off() : Unit = {
    println("Motor Off")
  }
  
  
  def signal() : Unit ={
    val f = new Flare
    f.light();
  }
  
}