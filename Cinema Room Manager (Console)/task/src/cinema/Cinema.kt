package cinema

fun main() {
    // write your code here
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seats = readLine()!!.toInt()
    println("Total income:")
    if (rows * seats <= 60) {
        println("$${rows * seats * 10}")
    } else {
        println("$${(rows / 2 * seats * 10) + (rows - rows / 2) * seats * 8}")
    }

}