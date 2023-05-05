fun main() {
    val n = readLine()!!.toInt()
    val numbers = mutableSetOf<Int>()
    for (i in 1..n) {
        val number = readLine()!!.toInt()
        numbers.add(number)
    }
    val m = readLine()!!.toInt()
    if (m in numbers) {
        println("YES")
    } else {
        println("NO")
    }
}
