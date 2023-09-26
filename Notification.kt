//Program To show number of notification if less than 100 and to show 99+ if greater than 100

fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("Number Of Notifications are $numberOfMessages")
        }
    else {
        println("Number Of Notifications are 99+")
    }
}
