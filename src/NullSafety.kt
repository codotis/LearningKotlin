
fun main(args:Array<String>) {

//    can't add null as a value unless specified. has to be a real value

//    var name:String
//    name = null
//    print(name)

//    ? = variable could have a null / could have value of string, number etc. (? - the specification described in previous comment)
    var name:String?
    name = "Otis"
//    !! = this variable has to have a value - if it doesn't throw an exception/error
    print(name!!)
}