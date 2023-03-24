fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    var bucks = 0
    if(isMonday){
        when {
            age in 0..12 -> bucks = 15
            age in 13..60 -> bucks = 25
            age >= 61 -> bucks = 20
            else -> print("Invalid age")
        }
        return bucks
    } else {
        
        when {
            age in 0..12 -> bucks = 15
            age in 13..60 -> bucks = 30
            age >= 61 -> bucks = 20
            else -> print("Invalid age")
        }
        return bucks
    }
}