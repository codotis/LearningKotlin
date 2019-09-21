

//Basic maths calculator

fun main(args:Array<String>) {
    println("**** Maths Calculator ****")
    print("enter num1: ")
    var num1:Float = readLine()!!.toFloat()
    print("enter num2: ")
    var num2:Float = readLine()!!.toFloat()
    var mult:Float?

    mult = num1 * num2

    println("mult: $mult")
}