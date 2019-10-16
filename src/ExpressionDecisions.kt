fun main (args:Array<String>) {
    var num1 = 15
    var num2 = 30
    var max = if (num1 > num2) num2 else num2

    print("max: $max")

    var height = 180

    var isTall = when (height) {
        180 -> true
        else -> false
    }
    print("isTall: $isTall")


//    var max:Int?
//    if (num1 > num2  ) {
//        max = num1
//    } else {
//        max = num2
//    }
}