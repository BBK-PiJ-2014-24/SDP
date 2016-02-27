package mapReduce

object mapVector extends App{
  
    import atomicscala.AtomicTest._ 
  
    val v = Vector(1, 2, 3, 4)
    v.map(n => n + 1) is Vector(2, 3, 4, 5)
    
  //  v.foreach { x => x + 1 } is Vector(2, 3, 4, 5)
    
   
    
    val v1 = Vector(1, 2, 3, 4)
    v1.map(x => 11*x +10) is Vector(21, 32, 43, 54)
    
    val v2 =  for(i <- v) yield i + 1
    v2 is Vector(2, 3, 4, 5)
  
}