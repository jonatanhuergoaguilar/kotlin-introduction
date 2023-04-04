package example
open class Shape

class Rectangle( height: Double, length: Double ):Shape() {
    var perimeter = (height + length) * 2
}
fun main () {
    val rectangle = Rectangle(9.20, 26.06)
    println("The perimeter is ${rectangle.perimeter}")
}