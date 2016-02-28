package traitsInheritance5e

object Draw {
 
  def apply(s : Shape) = s match{
    case c: Circle => "A circle of radius " + c.r + "cm with " + findColour(c) + " colour" 
    case r: Rectangle => "A rectangle of width " + r.sideLengthA + "cm and height " +  r.sideLengthB + "cm with " + findColour(r) + " colour" 
    case s: Square => "A square of length " + s.sideLengthA + "cm with " + findColour(s) + " colour" 
  }
  
  def findColour(shp:Shape) : String = shp.getColour() match {
    case r:RedColour => "Red"
    case y:YellowColour => "Yellow"  
    case p:PinkColour => "Pink" 
    case m:makeColour => m.luma()
  }
    
  
}