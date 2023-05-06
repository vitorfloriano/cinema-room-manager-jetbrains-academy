fun main() {
    // write your code here
    val direction = readLine()!!
    val result = when (direction) {
        "1" -> "move up"
        "2" -> "move down"
        "3" -> "move left"
        "4" -> "move right"
        "0" -> "do not move"
        else -> "error!"
    }
    println(result)
}