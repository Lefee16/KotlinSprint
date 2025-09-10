package org.example.lesson_2

fun main() {

    val workers = 50
    val interns = 30

    val workersSalary = 30000
    val internsSalary = 20000

    val workersSalaryCost = workers * workersSalary
    val internsSalaryCost = interns * internsSalary

    val totalSalaryCosts = workersSalaryCost + internsSalaryCost
    val averageSalary = totalSalaryCosts / (workers + interns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $workersSalaryCost")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryCosts")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $averageSalary")

}