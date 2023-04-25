fun main() {
    var group1 : UInt = readln().toUInt()
    var group2 : UInt = readln().toUInt()
    var group3 : UInt = readln().toUInt()

    var desksNeeded = ((group1 / 2u) + group1 % 2u)+((group2 / 2u) + group2 % 2u)+((group3 / 2u) + group3 % 2u)
    println(desksNeeded)
}