fun main() {
    val char1 = readln().single()
    val char2 = readln().single()
    val char3 = readln().single()

    if (char2 == char1 + 1 && char3 == char2 + 1) {
        println(true)
    } else {
        println(false)
    }
}