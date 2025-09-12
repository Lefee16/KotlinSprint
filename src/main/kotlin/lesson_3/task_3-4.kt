package org.example.lesson_3

fun main() {

    var counter = 0
    var firstMove = "E2"
    var lastMove = "E4"
    counter++

    println("[$firstMove:$lastMove;$counter]")

    firstMove = "D2"
    lastMove = "D3"
    counter++
    val result = "[$firstMove:$lastMove;$counter]"

    println(result)

}