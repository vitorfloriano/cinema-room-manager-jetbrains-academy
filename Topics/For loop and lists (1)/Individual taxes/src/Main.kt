fun main() {
    // write your code here
    val totalCompanies = readln()!!.toInt()
    val incomes: MutableList<Int> = MutableList(totalCompanies) { 0 }
    var totalTax = 0
    var maxTax = incomes[0]
    for (i in 0 until totalCompanies) {
        incomes[i] = readln()!!.toInt()
    }
    val taxes: MutableList<Int> = mutableListOf()
    for (i in 1..totalCompanies) {
        taxes.add(readln()!!.toInt())
    }
    for (i in 0 until totalCompanies) {
        if (incomes[i] * taxes[i] > totalTax) {
            totalTax = incomes[i] * taxes[i]
            maxTax = i + 1
        }
    }
    println(maxTax)
}
