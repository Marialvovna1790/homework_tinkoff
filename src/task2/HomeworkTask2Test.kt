package task2

import org.junit.Test
import kotlin.test.assertEquals


class HomeworkTask2Test {

    @Test
    fun reverseValidNumber() {
        val inputNumbers = arrayOf(123, 321, -987, 999, 100, 255, 0, 12, -5)
        val reversedNumbers = arrayOf(321, 123, 789, 999, 1, 552, 0, 21, 5)

        val actualNumbers = inputNumbers.map { HomeworkTask2().reverseNumber(it) }
        val testPairs = reversedNumbers zip actualNumbers

        for((actual, expected) in testPairs) {
            assertEquals(expected, actual, "Wrong reversed number")
        }
    }

    @Test(expected = NumberFormatException::class)
    fun reverseInvalidNumber() {
        HomeworkTask2().reverseNumber(1000)
    }

}