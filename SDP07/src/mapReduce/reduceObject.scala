package mapReduce

object reduceObject extends App {
  
  import atomicscala.AtomicTest._ 
  
  val v = Vector(1, 10, 100, 1000)
  v.reduce((sum, n) => sum + n) is 1111
  
  var sum = 0
  for(x <- v) { sum = sum + x }
  sum is 1111  
 
  def sumIt(nums:Int*) : Int ={
    var sum = 0
    for(x <- nums) { sum = sum + x }
    sum
  }
  
  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195
  
  
  
  
}