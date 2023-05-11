package cinema

fun main() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seats = readLine()!!.toInt()

    // Initialize the cinema as a two-dimensional array
    val cinema = Array(rows) { Array(seats) { "S" } }

    var purchasedTickets = 0
    var currentIncome = 0

    fun printCinema() {
        println("Cinema:")
        print(" ")
        for (i in 1..seats) {
            print(" $i")
        }
        println()
        for (i in cinema.indices) {
            print("${i + 1}")
            for (j in cinema[i].indices) {
                print(" ${cinema[i][j]}")
            }
            println()
        }
        println()
    }

    fun buyTicket() {
        while (true) {
            println("Enter a row number:")
            val row = readLine()!!.toInt() - 1
            println("Enter a seat number in that row:")
            val seat = readLine()!!.toInt() - 1

            // Check if the seat is already booked or out of bounds
            if (row < 0 || row >= rows || seat < 0 || seat >= seats) {
                println("Wrong input!")
            } else if (cinema[row][seat] == "B") {
                println("That ticket has already been purchased!")
            } else {
                // Book the seat and update the current income
                cinema[row][seat] = "B"
                purchasedTickets++
                val ticketPrice = if (rows * seats <= 60 || row < rows / 2) 10 else 8
                currentIncome += ticketPrice
                println("Ticket price: $$ticketPrice")
                println()
                break
            }
        }
    }

    fun showStatistics() {
        val totalIncome = if (rows * seats <= 60) {
            rows * seats * 10
        } else {
            (rows / 2 * seats * 10) + ((rows - rows / 2) * seats * 8)
        }
        val percentage = purchasedTickets.toDouble() / (rows * seats) * 100
        val formatPercentage = "%.2f".format(percentage)
        println("Number of purchased tickets: $purchasedTickets")
        println("Percentage: $formatPercentage%")
        println("Current income: $$currentIncome")
        println("Total income: $$totalIncome")
        println()
    }

    while (true) {
        println("1. Show the seats")
        println("2. Buy a ticket")
        println("3. Statistics")
        println("0. Exit")

        when (readLine()!!.toInt()) {
            1 -> printCinema()
            2 -> buyTicket()
            3 -> showStatistics()
            0 -> return
            else -> println("Invalid input")
        }
    }
}

