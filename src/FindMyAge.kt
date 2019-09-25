

fun main(args:Array<String>) {

    print("Please enter your year of birth:")
    var birthYear:Int = readLine()!!.toInt()

    var age = 2019 - birthYear

    print("Your age is: $age")

}