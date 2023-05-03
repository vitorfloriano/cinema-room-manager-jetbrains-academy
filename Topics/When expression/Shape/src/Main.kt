fun main(args: Array<String>) {
    // write your code here
    val shapeNumber = readLine()!!.toInt()
    val shape = when (shapeNumber) {
        1 -> "square"
        2 -> "circle"
        3 -> "triangle"
        4 -> "rhombus"
        else -> "unknown"
    }
    println(
        when (shape) {
            "square" -> "You have chosen a square"
            "circle" -> "You have chosen a circle"
            "triangle" -> "You have chosen a triangle"
            "rhombus" -> "You have chosen a rhombus"
            else -> "There is no such shape!"
    }
    )
}
