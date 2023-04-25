fun main() {
    val nuts = readln().toInt()
    val squirrels = readln().toInt()
    val nutsPersquirrel = squirrels % nuts
    println(nutsPersquirrel)
}