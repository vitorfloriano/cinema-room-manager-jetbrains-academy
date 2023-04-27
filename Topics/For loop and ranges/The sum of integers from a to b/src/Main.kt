fun main() {
    // put your code here
    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()
    var initNumber = 0
    for (number in firstNumber..secondNumber) {
        initNumber += number
    }
    print(initNumber)
}