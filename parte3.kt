package bot

fun main() {

    println("Hello! My name is Kyara.")
    println("I was created in 2023.")
    println("Please, remind me your name.")

    val name = readln()

    println("What a great name you have, $name!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val remainder3 = readln().toInt()
    val remainder5 = readln().toInt()
    val remainder7 = readln().toInt()

    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    println("Your age is $yourAge; that's a good time to start programming!")
}
