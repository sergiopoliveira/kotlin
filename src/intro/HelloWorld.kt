package intro

fun main() {
    val name = "Kotlin"
    println("Hello, $name!")
}

val question = "life, the universe " + "and everything"

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
    println(question)

    var number = 1;
    number++
    println(number)
}
