package task2

class HomeworkTask2 {

    fun reverseNumber(toReverse: Int): Int {
        if (toReverse == 0) return 0
        if (Math.abs(toReverse) > 999) {
            throw NumberFormatException("Number must be in [-999...999]")
        }
        val toReverseString = toReverse.toString()
        val startIndexInclusive = toReverseString.indexOfFirst { it == '-' } + 1
        val endIndexExclusive = toReverseString.indexOfLast { (it - '0') in 1..9 } + 1
        return toReverseString
                .substring(startIndexInclusive, endIndexExclusive)
                .reversed()
                .toInt()
    }
}

fun main(args: Array<String>) {
    println(HomeworkTask2().reverseNumber(123))
}