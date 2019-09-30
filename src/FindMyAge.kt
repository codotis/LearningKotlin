import java.util.*

fun main(args:Array<String>) {

    print("Please enter your year of birth:")
    var birthYear:Int = readLine()!!.toInt()

    var currentYear = Calendar.getInstance().get(Calendar.YEAR) //reads from computers calendar. get instance of that calendar then get calendar year from that instance
    var age = currentYear - birthYear

    print("Your age is: $age")

} 