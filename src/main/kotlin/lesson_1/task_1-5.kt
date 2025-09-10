package org.example.lesson_1

fun main() {

    val timeIsSpace = 6480
    val hoursInSpace = timeIsSpace / 3600
    val minutesInSpace = (timeIsSpace % 3600) / 60
    val secondsInSpace = timeIsSpace % 60
    val result = "%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpace)

    println(result)

}