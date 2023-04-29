fun main() {
    val n = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()
    repeat(n) {
        numbers.add(readLine()!!.toInt())
    }
    var maxLength = 1
    var currentLength = 1
    for (i in 1 until n) {
        if (numbers[i] >= numbers[i-1]) {
            currentLength++
            maxLength = maxOf(maxLength, currentLength)
        } else {
            currentLength = 1
        }
    }
    println(maxLength)
}
