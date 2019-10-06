fun main(args:Array<String>) {

    println("Enter the amount of trainers you own:")
    var trainers = readLine()!!.toDouble()

    if (trainers >= 50) {
        println("Wow! You're a real sneakerhead, aren't you? Considered opening up a store?")
    }

    if (trainers >= 25 && trainers < 50) {
        println("That's an unhealthy amount of trainers. One for every day in the month, eh?")
    }

    if (trainers >= 10 && trainers < 25) {
        println("Steady on, I see where this is going!")
    }

    if (trainers >= 5 && trainers < 10) {
        println("Not a fanatic, but you like to have nice footwear")
    }

    if (trainers >= 0 && trainers < 5) {
        println("Small but sweet. Unless you don't own any, then I guess you prefer a different style")
    }


}