fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    when (n) {
        1, 3, 4 -> println("No!")
        2 -> println("Yes!")
        else -> println("Unknown number")
    }
}