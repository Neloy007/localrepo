fun main(args: Array<String>) {
    print("Enter a side of the Square: ")
    val side = readLine()?.toDoubleOrNull()
    when {
        side == null -> println("Please enter a valid decimal number.")
        side < 0 -> println("Length cannot be negative.")
        else -> {
            val area = side*side
            println("Area of the square is: $area")
        }
    }
}