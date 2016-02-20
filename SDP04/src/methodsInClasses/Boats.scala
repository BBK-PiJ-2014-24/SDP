package methodsInClasses

object Boats {
  
  def main(args : Array[String]) : Unit ={
    
    val s = new Sailboat()
    val s1 = s.raiseSails()
    val s2 = s.lowerSails()
    val s3 = s.signal()
    assert(s1 == (), "Got " + s1 )
    assert(s2 == (), "Got " + s2 )
    
    
    
    val m = new Motorboat()
    val m1 = m.on()
    val m2 = m.off()
    val m3 = m.signal()
    //assert(m1 = (), "Got " +  m1)
  }
}