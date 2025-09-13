package org.example.lesson_3

fun main() {

    val text = "[E2:E4;1]"
    val cleaned = text.removePrefix("[").removeSuffix("]")
    val (firstAndLastMove, move) = cleaned.split(";")
    val (firstMove, lastMove) = firstAndLastMove.split(":")

    println(firstMove)
    println(lastMove)
    println(move)


}