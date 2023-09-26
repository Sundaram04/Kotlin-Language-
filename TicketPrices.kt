// To calculates these age-based ticket prices:

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is Rs.${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is Rs.${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is Rs.${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}
