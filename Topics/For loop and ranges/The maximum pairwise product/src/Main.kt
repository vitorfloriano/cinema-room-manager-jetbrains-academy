fun main() {
    val n = readLine()!!.toInt()
    var max1: Long = -1
    var max2: Long = -1
    for (i in 1..n) {
        val num = readLine()!!.toLong()
        if (num > max1) {
            max2 = max1
            max1 = num
        } else if (num > max2) {
            max2 = num
        }
    }
    if (n == 1) {
        println(max1)
    } else {
        println(max1 * max2)
    }
}
