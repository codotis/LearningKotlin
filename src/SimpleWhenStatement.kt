fun main (args:Array<String>) {

    var x=685

    when (x) {

        in 1..9-> {
            print("value is 1 digit long")
        }
        in 10..99-> {
            print("value is 2 digits long")
        }
        in 100..990-> {
            print("value is 3 digits long")
        }
        else -> print("value is not in range")
    }
}