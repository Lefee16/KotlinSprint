package org.example.lesson_1

fun main() {

    val timeIsSpace = 6480
    val hoursInSpace = timeIsSpace / TIME_IN_3600
    val minutesInSpace = (timeIsSpace % TIME_IN_3600) / TIME_IN_60
    val secondsInSpace = timeIsSpace % TIME_IN_60
    val result = "%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpace)

    println(result)

}

const val TIME_IN_60 = 60
const val  TIME_IN_3600 = 3600