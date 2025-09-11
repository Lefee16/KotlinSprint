package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val sum = 70000
    val percent = 16.7
    val years = 20

    val result =  sum * (1 + (percent/100)).pow(years)
    println(String.format("%.3f", result))

}