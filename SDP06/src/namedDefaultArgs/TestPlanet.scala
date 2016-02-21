package namedDefaultArgs

object TestPlanet extends App{
  
   import atomicscala.AtomicTest._
  
   val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
   p.hasMoon is false
   
   val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")
   earth.hasMoon is true
  
  
}