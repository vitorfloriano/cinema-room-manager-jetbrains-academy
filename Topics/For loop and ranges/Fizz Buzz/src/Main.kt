fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    for (i in a..b) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}