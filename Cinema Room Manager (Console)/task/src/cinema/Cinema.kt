package cinema

fun main() {
    // write your code here
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seats = readLine()!!.toInt()

    println("Cinema:")
    print(" ")
    for (i in 1..seats) {
        print(" $i")
    }
    println()
    for (i in 1..rows) {
        print("$i")
        for (j in 1..seats) {
            print(" S")
        }
        println()
    }
    println("Enter a row number:")
    val row = readLine()!!.toInt()
    println("Enter a seat number in that row:")
    val seat = readLine()!!.toInt()
    println("Ticket price: ")
    if (rows * seats <= 60) {
        println("$10")
    } else {
        if (row <= rows / 2) {
            println("$10")
        } else {
            println("$8")
        }
    }
    println()
    println("Cinema:")
    print(" ")
    for (i in 1..seats) {
        print(" $i")
    }
    println()
    for (i in 1..rows) {
        print("$i")
        for (j in 1..seats) {
            if (i == row && j == seat) {
                print(" B")
            } else {
                print(" S")
            }
        }
        println()
    }
    println()

}