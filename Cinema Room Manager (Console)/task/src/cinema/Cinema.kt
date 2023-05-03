package cinema

fun main() {
    println("Enter the number of rows:")
    val numRows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val numSeats = readLine()!!.toInt()

    // Initialize an empty 2D array to represent the cinema seating chart
    val seats = Array(numRows) { Array(numSeats) { 'S' } }

    while (true) {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("0. Exit")

        when (readLine()!!.toInt()) {
            1 -> showSeats(seats)
            2 -> buyTicket(seats)
            0 -> return
        }
    }
}

fun showSeats(seats: Array<Array<Char>>) {
    println("Cinema:")
    print(" ")
    for (i in 1..seats[0].size) {
        print(" $i")
    }
    println()

    for (i in seats.indices) {
        print("${i + 1}")
        for (j in seats[i].indices) {
            print(" ${seats[i][j]}")
        }
        println()
    }
    println()
}

fun buyTicket(seats: Array<Array<Char>>) {
    while (true) {
        println("Enter a row number:")
        val row = readLine()!!.toInt()
        println("Enter a seat number in that row:")
        val seat = readLine()!!.toInt()

        if (row !in 1..seats.size || seat !in 1..seats[0].size) {
            println("Wrong input!")
            continue
        }

        if (seats[row - 1][seat - 1] == 'B') {
            println("That ticket has already been purchased!")
            continue
        }

        val ticketPrice = if (seats.size * seats[0].size <= 60 || row <= seats.size / 2) {
            10
        } else {
            8
        }

        println("Ticket price: $$ticketPrice")
        seats[row - 1][seat - 1] = 'B'
        break
    }
    println()
}

