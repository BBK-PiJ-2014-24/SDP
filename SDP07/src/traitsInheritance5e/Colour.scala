package traitsInheritance5e

sealed trait Colour {
  
  var R = 0 
  var G = 0
  var B = 0
  
  var RGB = (R, G, B)
  
  // is light or dark
  def luma() : String = {
    val Y = 0.2126*R + 0.7152*G + 0.0722*B
    val ans = Y match {
      case x if (0 to 127).contains(x) => "dark"
      case x if (128 to 255).contains(x) => "light"
    }
    ans
  }   
}

class RedColour extends Colour{ 
   R = 255
   G = 0
   B = 0  
}

class YellowColour extends Colour{
  
   R = 0
   G = 255
   B = 255
  
}

class PinkColour extends Colour{
  
   R = 255
   G = 0
   B = 255  
}

class makeColour(r:Int, g:Int, b:Int) extends Colour{
  
  R = r
  G = g
  B = b  
}

object makeColour{
  def apply(r:Int, g:Int, b:Int) = new makeColour(r:Int, g:Int, b:Int) 
}




