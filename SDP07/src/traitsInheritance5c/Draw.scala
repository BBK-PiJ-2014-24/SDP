package traitsInheritance5c

object Draw {
 
  def apply(s : Shape) = s match{
    case c: Circle => "A circle of radius " + c.r + "cm" 
    case r: Rectangle => "A rectangle of width " + r.sideLengthA + "cm and height " +  r.sideLengthB + "cm"
    case s: Square => "A square of length " + s.sideLengthA + "cm"
  }
  
  
  
}