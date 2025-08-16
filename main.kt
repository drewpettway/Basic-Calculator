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
    println("clear, version, add, subtract, multiply, divide")
}

fun version() {
    println("CLI Calculator, 0.2")
}

fun multiplication(x:Int, y:Int): Int {
    return x * y
}

fun division(x:Int, y:Int): Int {
    return x / y
}

fun main() {
    var mode = "menu"
    while (true) { //Menu start
        println("What would you like to do? 'Type 'help' for a list of commands")
        val userCommand = readLine()
        when (userCommand) {
            "clear" -> fakeClear()
            "add" -> mode = "add"
            "subtract" -> mode = "subtract"
            "multiply" -> mode = "multiply"
            "divide" -> mode = "divide"
            "help" -> help()
            "version" -> version()
            "quit" -> { println("Bye"); break }
            "debug" -> println("Mode: $mode")
            else -> println("Invalid Command")
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
        if (mode == "subtract") { //Subtract block start
            println("Please type the first number")
            var input1 = readLine()?.toIntOrNull()
            println("Please type the second number")
            var input2 = readLine()?.toIntOrNull()
            if (input1 != null && input2 != null) {
                var result = subtract(input1, input2)
                println("The answer is $result")
                mode = "menu"
            } else {
                println("Not a valid input")
            }

        } //End of subtract block

        if (mode == "multiply") { //Multiplication block start
            println("Please type the first number")
            var input1 = readLine()?.toIntOrNull()
            println("Please type the second number")
            var input2 = readLine()?.toIntOrNull()
            if (input1 != null && input2 != null) {
                var result = multiplication(input1, input2)
                println("The answer is $result")
                mode = "menu"
            } else {
                println("Not a valid input")
            }
        } //End of multiplication block

        if (mode == "divide") { //Division block start
            println("Please type the first number")
            var input1 = readLine()?.toIntOrNull()
            println("Please type the second number")
            var input2 = readLine()?.toIntOrNull()
            if (input1 != null && input2 == 0) {
                println("Can not divide by zero")
            } else if (input1 != null && input2 != null) {
                var result = division(input1, input2)
                println("The answer is $result")
                mode = "menu"
            } else {
                println("Not a valid input")
            }
    } //Division block end

      }
}