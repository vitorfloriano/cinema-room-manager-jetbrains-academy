fun main() {
    var N = readln().toUInt()
    var oddEven = N % 2u
    var nextNumber = N + 2u - oddEven
    println(nextNumber)
}