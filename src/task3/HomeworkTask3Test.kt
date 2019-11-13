package task3

import org.junit.Test

import org.junit.Assert.*

class HomeworkTask3Test {

    @Test
    fun checkYearSeason() {
        assertEquals("Зима", HomeworkTask3().checkYearSeason(2))
        assertEquals("Весна", HomeworkTask3().checkYearSeason(5))
        assertEquals("Лето", HomeworkTask3().checkYearSeason(9))
        assertEquals("Осень", HomeworkTask3().checkYearSeason(12))
    }

    @Test(expected = IllegalArgumentException::class)
    fun checkInvalidYearSeason() {
        HomeworkTask3().checkYearSeason(13)
    }
}