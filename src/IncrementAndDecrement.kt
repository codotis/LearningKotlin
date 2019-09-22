

// Operation Rules
//1 - ()
//2 - ++, -- (before variable)
//3 - ^
//4 - *, /
//5 - +, -
//6 - =
//7 - ++, -- (after variable)

fun main (args:Array<String>) {
    var x = 5
    var y = 7
    var z = ++x+y  //(++x) = (x = x+1), (--x) = (x = x-1)

    println(z)

    println("before x: $x")
    var m = x++ + y
    println("after x: $x")
    println("m: $m")
}