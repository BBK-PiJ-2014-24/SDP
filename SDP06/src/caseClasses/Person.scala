package caseClasses

class Person(first:String, last:String, email:String) {

   def first() : String = {
     first
   }
   
   def last() : String = {
     last
   }
    
   def email() : String = {
     email
   } 
   
   override
   def toString() : String = "Person(" + first + "," + last + "," + email + ")"
  
}

object Person{
  def apply(first:String, last:String, email:String) : Person = {
    new Person(first:String, last:String, email:String)
  }
}