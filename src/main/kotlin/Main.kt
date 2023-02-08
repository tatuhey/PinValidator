/*
    ID      : 30065695
    NAME    : Raihan Khalil Abdillah
    AT1 - Portofolio 1, Activity 4, Task A
    Pin Validator
 */

fun main(args: Array<String>) {

    println("The correct pin is 9876")
    val pinNumber: Int = 9876 // declaring correct PIN
    println("Please enter your Personal Identification Number: ")

    var enteredPIN: Int = readln().toInt() // using var because the entered PIN needs to be able to keep trying

    while (enteredPIN != pinNumber) { // entry condition into the while loop
        println("Wrong PIN, try again.")
        enteredPIN = readln().toInt() // to loop back to the start of while
    }
    println("PIN accepted.")
}