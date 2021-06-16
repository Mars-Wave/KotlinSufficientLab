fun main() {
    // val a = Person(null, "whatever", null) errors 
   
    
    //val e : String? = null
    //val b = Person(e, "Moro", 21) 
    //Type mismatch: inferred type is String? but String was expected
    //println("${b}")
    
    val a = Person("Tomas", "Moro", 21)
    
    println("${a}")
}

data class Person(
    val firstName: String, //strings cannot be init as null
    val lastName: String,  //strings cannot be init as null
    var age: Int,)	//Null can not be a value of a non-null type Int
{
   
    override fun toString() : String = (firstName + " " + lastName + ", age " + age)
}
