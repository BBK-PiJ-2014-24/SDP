package classArguments

class Family2(mum:String, dad:String, siblings:String*) {
  
  def familySize() : Int = {
    var i : Int = 0;
    for(s <- siblings){
      i = i + 1
      println(s)
    }
    i + 2 // assuming two parents
  } 
  
  
}