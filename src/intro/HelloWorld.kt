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
    println(
        listOf('a', 'b', 'c').joinToString(
            separator = "", prefix = "(", postfix = ")"
        )
    )

    displaySeparator()
    displaySeparator(size = 5)
    displaySeparator(size = 5, character = '$')
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun topLevel() = 1

class A {
    fun member() = 2
}

fun other() {
    fun local() = 3
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}
@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0): Int = a+b+c