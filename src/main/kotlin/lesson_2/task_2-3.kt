package org.example.lesson_2



fun main() {

    val startHour = 9
    val startMinute = 39
    val travelTimeInMinute = 457

    val allMinute = startHour * MINUTE_60 + startMinute + travelTimeInMinute
    val endHour = (allMinute / MINUTE_60) % DAY_24
    val endMinute = allMinute % MINUTE_60

    println("Время прибытия: $endHour:$endMinute")

}

const val MINUTE_60 = 60
const val DAY_24 = 24