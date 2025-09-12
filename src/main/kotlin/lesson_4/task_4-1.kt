package org.example.lesson_4

fun main() {

    val today = 13
    val tomorrow = 9

    println("Доступность столиков на сегодня: ${today < NUMBER_OF_TABLES}\n" +
            "Доступность столиков на завтра: ${tomorrow < NUMBER_OF_TABLES}")

}

const val NUMBER_OF_TABLES = 13