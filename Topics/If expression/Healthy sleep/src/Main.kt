fun main() {
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val H = readLine()!!.toInt()

    if (H in A..B) {
        println("Normal")
    } else if (H < A) {
        println("Deficiency")
    } else {
        println("Excess")
    }

}