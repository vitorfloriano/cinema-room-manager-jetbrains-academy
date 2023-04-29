fun main() {
    // write your code here
    val numberOfElements = readLine()!!.toInt()
    val list = MutableList(numberOfElements) { readLine()!! }
    for (i in 0 until numberOfElements - 1) {
        val temp = list[0]
        list.removeAt(0)
        list.add(temp)
    }
    println(list.joinToString(" "))
}
