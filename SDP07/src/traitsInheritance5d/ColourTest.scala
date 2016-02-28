package traitsInheritance5d

object ColourTest extends App{
  
  import atomicscala.AtomicTest._ 
  
  var black =  makeColour(0,0,0)
  black.luma() is "dark"
  
}