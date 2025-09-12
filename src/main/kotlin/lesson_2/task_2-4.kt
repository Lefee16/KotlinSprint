package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20

    val bonusCrystalOre = crystalOre * buffPercent / ONE_HUNDRED
    println("bonus crystal: $bonusCrystalOre")
    val bonusIronOre = ironOre * buffPercent / ONE_HUNDRED
    println("bonus iron: $bonusIronOre")

}

const val ONE_HUNDRED = 100