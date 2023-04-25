fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val n = 20
    println(a + b == n || a + c == n || b + c == n)
}