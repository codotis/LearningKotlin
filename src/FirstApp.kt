
fun main(args:Array<String>){

    println("Hi Otis, \n")
    println("Welcome to Kotlin")

    println("Hi Otis, ")
    println("Welcome to Kotlin")

    print("Hi Otis, ")
    print("Welcome to Kotlin")


//        changeable
    var x = 10


    //    unchangeable (constant)
    val y = 10


//    variable recognizes that it is storing a string
    var name = "Otis"

//    this variable can only be a string. (however doesn't have to have its datatype defined)
    var surname:String = "Otis"

//    this variable can only be a number. (however doesn't have to have its datatype defined)
    var age:Int = 25


//    question mark here - kotlin understands that this variable accepts null values (if this variable does not have a value, it will default to null)
//     needs to have datatype defined (in this case, string)
    var child:String?

    child = "Hero"
}