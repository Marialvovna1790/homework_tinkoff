package task1

class HomeworkTask1(private val lineReader: () -> String) {

    private val validNumberRegex = "-?\\d+(\\.\\d+)?".toRegex()

    @Throws(NumberFormatException::class)
    fun getEnteredNumberSentence(): String {
        val enteredString = lineReader()
        if (validNumberRegex.matches(enteredString)) {
            return "Вы ввели число $enteredString"
        } else {
            throw NumberFormatException("Not a number $enteredString!")
        }
    }
}

fun main(args: Array<String>) {
    val reader = {
        readLine()!!
    }
    val task = HomeworkTask1(reader)
    println(task.getEnteredNumberSentence())
}

