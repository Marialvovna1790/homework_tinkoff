package task4

class HomeworkTask4 {

    fun reorderArray(input: IntArray): IntArray {
        var indexPositive = input.lastIndex
        var indexNegative = 0
        val result = IntArray(input.size)

        for (number in input) {
            if (number < 0) {
                result[indexNegative++] = number
            } else {
                result[indexPositive--] = number
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    println(HomeworkTask4().reorderArray(intArrayOf(1, 2, -2, 4, -1, -9, 14, 142, -7, 0, 0, 3)).asList())
    println(HomeworkTask4().reorderArray(intArrayOf(1, -2)).asList())
}