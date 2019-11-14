package task1

import org.junit.Test
import kotlin.test.assertEquals

class HomeworkTask1Test {

    private val pattern = "Вы ввели число %s"

    @Test
    fun testValidNumbers() {
        val validNumbers = arrayOf(42, -123, 0, Long.MIN_VALUE, Long.MAX_VALUE, 123.3, -32.3214)
        for (validNumber in validNumbers) {
            val task = HomeworkTask1 {
                validNumber.toString()
            }
            assertEquals(pattern.format(validNumber), task.getEnteredNumberSentence())
        }
    }

    @Test
    fun testInvalidNumbers() {
        val invalidNumbers = arrayOf("foo", "-asd123", "123e123", "-12.", "231_", "")
        var actualExceptions = 0
        for (invalidNumber in invalidNumbers) {
            try {
                val task = HomeworkTask1 {
                    invalidNumber
                }
                task.getEnteredNumberSentence()
            } catch (ex: NumberFormatException) {
                actualExceptions++
            }
        }
        assertEquals(invalidNumbers.size, actualExceptions, "Wrong number of exceptions")
    }
}