fun main() {
    // write your code here
    val shape = readln()!!
    val area = when (shape) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val s = (a + b + c) / 2
            println(Math.sqrt(s * (s - a) * (s - b) * (s - c)))
        }
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            println(a * b)
        }
        "circle" -> {
            val r = readln().toDouble()
            println(3.14 * r * r)
        }
        else -> 0.0
    }

}