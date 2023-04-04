package example.basicTypes

fun main () {
    print( "Enter a number: " )

    // reads line from standard input - keyboard
    val stringInput = readln()

    // converts the string input to integer
    val integer:Int = stringInput.toInt()

    // println() prints the following line to the output screen
    println( "You entered $integer" )
}