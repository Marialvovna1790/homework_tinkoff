package task3

class HomeworkTask3 {
    fun checkYearSeason(month: Int): String {
        return when (month) {
            in 1..3 -> "Зима"
            in 4..6 -> "Весна"
            in 7..9 -> "Лето"
            in 10..12 -> "Осень"
            else -> {
                throw IllegalArgumentException("Month should be in [1..12]")
            }
        }
    }
}

fun main(args: Array<String>) {
    println(HomeworkTask3().checkYearSeason(3))
}