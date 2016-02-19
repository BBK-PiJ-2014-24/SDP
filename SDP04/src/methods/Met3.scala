package methods

object Met3 {
  
  def manyTimesString(s : String, x : Int) : String = {
 
    var ans = ""
    for(i <- 1 to x){
      ans = s + ans 
    }
    ans 
  }
  
   def main(args : Array[String]) : Unit ={
    val m1 = manyTimesString("abc",3)
    println(m1)
    assert("abcabcabc" == m1, "abc*3")
    
    val m2 = manyTimesString("123",2)
    println(m2)
    assert("123123" == m2, "123*2")
   }
  
  
  
}