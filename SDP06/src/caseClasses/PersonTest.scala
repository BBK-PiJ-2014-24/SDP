package caseClasses

object PersonTest extends App {
  
   import atomicscala.AtomicTest._
   
   val p = Person("Jane", "Smile", "jane@smile.com")
   p.first is "Jane"
   p.last is "Smile"
   p.email is "jane@smile.com"
   
   
}