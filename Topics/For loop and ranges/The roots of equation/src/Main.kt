fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    
    for (x in 0..1000) {
        val result = a * x * x * x + b * x * x + c * x + d
        if (result == 0) {
        println(x)
        }
    }
}
