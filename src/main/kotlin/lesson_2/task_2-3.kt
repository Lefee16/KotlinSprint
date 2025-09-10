package org.example.lesson_2



fun main() {

    val startHour = 9
    val startMinute = 39
    val travelTimeInMinute = 457

    val allMinute = startHour * 60 + startMinute + travelTimeInMinute
    val endHour = (allMinute / 60) % 24
    val endMinute = allMinute % 60

    println("Время прибытия: $endHour:$endMinute")

}