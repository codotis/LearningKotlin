fun main(args:Array<String>) {

    print("Enter name: ")
    var name = readLine()
    print("Enter age: ")

//    double bang - we are expecting input of null and to convert that input into an integer
    var age:Int = readLine()!!.toInt()
    print("Enter department: ")
    var department = readLine()
    print("Enter the value of pi: ")
    var pi:Double = readLine()!!.toDouble()


    println("****** output ******")
    println("name:$name")
    println("age: $age")
    println("department: $department")
    println("pi:  $pi")
}