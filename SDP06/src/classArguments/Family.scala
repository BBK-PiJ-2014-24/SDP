package classArguments

class Family(famMembers : String*) {
  
  def familySize() : Int = {
    var i : Int = 0;
    for(s <- famMembers){
      i = i + 1
      println(s)
    }
    i
  } 
}

