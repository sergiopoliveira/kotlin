package intro

fun main() {
    val name = "Kotlin"
    println("Hello, $name!")
}

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")
}
