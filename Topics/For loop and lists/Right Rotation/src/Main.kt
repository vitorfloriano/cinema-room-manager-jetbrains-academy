fun main() {
    // write your code here
    val numberOfElements = readLine()!!.toInt()
    val list = MutableList(numberOfElements) { readLine()!!.toInt() }
    val rotation = readLine()!!.toInt()
    val optimizedRotation = rotation % list.size
    repeat(optimizedRotation) {
        val last = list.last()
        list.removeAt(list.lastIndex)
        list.add(0, last)
    }
    println(list.joinToString(" "))
}
