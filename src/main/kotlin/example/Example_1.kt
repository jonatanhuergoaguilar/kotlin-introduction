package example

fun main () {

    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}
fun printNotificationSummary (numberOfMessages: Int){
    if ( numberOfMessages >= 100 ) {
        println( "Your phone is blowing up! You Have 99+ notifications. " )
    } else {
        println( "You have $numberOfMessages notifications." )
    }
}
