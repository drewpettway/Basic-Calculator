fun add(x:Int, y:Int): Int {
    return x + y
}

fun subtract(x:Int, y:Int): Int {
    return x - y
}

fun fakeClear() {

    repeat(50) {
        println("-")
    }

}

fun help() {
    println("clear, version, add, subtract")
}

fun version() {
    println("CLI Calculator, 0.1")
}

fun main() {
    var mode = "menu"
    while (true) { //Menu start
        println("What would you like to do? 'Type 'help' for a list of commands")
        val userCommand = readLine()
        if (userCommand == "clear") {
            fakeClear()
        } else if (userCommand == "add") {
            mode = "add"
        } else if (userCommand == "subtract") {
            mode = "subtract"
        } else if (userCommand == "help") {
            help()
        } else if (userCommand == "version") {
            version()
        } else {
            println("Invalid command")
        } //Menu end
        if (mode == "add") { //Add block start
            println("Please type the first number")
            var input1 = readLine()?.toIntOrNull()
            println("Please type the second number")
            var input2 = readLine()?.toIntOrNull()
            if (input1 != null && input2 != null) {
                var result = add(input1, input2)
                println("The answer is $result")
                mode = "menu"
            } else {
                println("Not a valid input")
            }
        } //End of add block
        if (mode == "subtract") {
            println("Please type the first number")
            var input1 = readLine()?.toIntOrNull()
            println("Please type the second number")
            var input2 = readLine()?.toIntOrNull()
            if (input1 != null && input2 != null) {
                var result = subtract(input1, input2)
                println("The answer is $result")
            } else {
                println("Not a valid input")
            }

        }
    }
}