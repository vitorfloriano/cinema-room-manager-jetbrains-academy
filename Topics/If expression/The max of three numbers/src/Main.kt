fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a > c) {
        if (a > b) {
            println(a)
        } else {
            println(b)
        }
    } else {
        if (c > b) {
            println(c)
        } else {
            println(b)
        }
    }
}