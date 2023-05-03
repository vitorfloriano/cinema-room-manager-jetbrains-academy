fun main() {
    // write your code here
    val (hour, minute, second) = readln().split(' ')
    val (day, month, year) = readln().split(' ')
    print("$hour:$minute:$second $day/$month/$year")
}