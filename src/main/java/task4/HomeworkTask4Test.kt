package task4

import org.junit.Test

import org.junit.Assert.*

class HomeworkTask4Test {

    @Test
    fun reorderArrayTest() {
        val inputCases: Array<IntArray> = arrayOf(
                intArrayOf(1, 2, 3, -1, -2, -3),
                intArrayOf(-2, -1, 2, 3),
                intArrayOf(0, -2, -1, 0, 3, -1),
                intArrayOf(1),
                intArrayOf(-1),
                intArrayOf(1, 1, 1),
                intArrayOf(-21, -31, -221),
                intArrayOf(1, 2, 3, 4, -1),
                intArrayOf(1, -1, -2, -3, -4)
        )

        val expectedResults: Array<IntArray> = arrayOf(
                intArrayOf(-1, -2, -3, 3, 2, 1),
                intArrayOf(-2, -1, 3, 2),
                intArrayOf(-2, -1, -1, 3, 0, 0),
                intArrayOf(1),
                intArrayOf(-1),
                intArrayOf(1, 1, 1),
                intArrayOf(-21, -31, -221),
                intArrayOf(-1, 4, 3, 2, 1),
                intArrayOf(-1, -2, -3, -4, 1)
        )

        val resultPairs = inputCases.map {
            HomeworkTask4().reorderArray(it)
        } zip expectedResults

        for ((actual, expected) in resultPairs) {
            assertArrayEquals(expected, actual)
        }
    }
}