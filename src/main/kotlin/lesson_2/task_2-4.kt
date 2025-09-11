package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20

    val bonusCrystalOre = crystalOre * buffPercent / 100
    println("bonus crystal: $bonusCrystalOre")
    val bonusIronOre = ironOre * buffPercent / 100
    println("bonus iron: $bonusIronOre")

}