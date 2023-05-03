fun main() {
    // write your code here
    val numbers: MutableList<Int> = mutableListOf()
    var max = 0
    var index = 0
    repeat(readLine()!!.toInt()) {
        numbers.add(readLine()!!.toInt())
    }
    for (i in numbers.indices) {
        if (numbers[i] > max) {
            max = numbers[i]
            index = i
        }
    }
    println(index)
}