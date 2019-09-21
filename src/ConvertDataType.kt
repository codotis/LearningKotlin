
fun main(args:Array<String>) {

    var num1:Int = 10
    var num2:Int?
    var num2String:String = "13"

//    below line won't work because num2 has a defined datatype of int
//    num2 = num2String
    num2 = num1
    num2 = num2String.toInt()

    var num2Float:Float?
    num2Float = num2String.toFloat()

    println("num1: " + num1.toDouble())
    println("num2: $num2")
    println("num2 as float: $num2Float")

    var xpi:Double = 3.14
    println("pi: $xpi")
    var intPi:Int = xpi.toInt()
    println("IntPi: " + intPi.toString())
}