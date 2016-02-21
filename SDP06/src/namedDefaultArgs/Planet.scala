package namedDefaultArgs

class Planet(name : String, description:String, moons:Int = 1) {
  
  def hasMoon() : Boolean = {
     val ans = moons > 0
     ans
  }
  
}