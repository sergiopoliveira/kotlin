package intro

/**
 * Checking identifier
 *
 * Implement the function that checks whether a string is a valid identifier.
 * A valid identifier is a non-empty string that starts with a letter or underscore
 * and consists of only letters, digits and underscores.
 */
fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty()) return false
    val firstChar = s[0]
    if (firstChar != '_' && firstChar !in 'a'..'z') {
        return false
    }
    for (c in s.toCharArray()) {
        if (c != '_' && c !in 'a'..'z' && c !in '0'..'9') {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}