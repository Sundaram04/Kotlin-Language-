//Return a value from a function

fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday To You"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
fun main() {
    val greeting = birthdayGreeting()
    println(greeting)
}
