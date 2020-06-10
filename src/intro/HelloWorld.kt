@file:JvmName("Utils")
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

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun topLevel() = 1

class A {
    fun member() = 2
}

fun other() {
    fun local() = 3
}