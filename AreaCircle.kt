fun main(args: Array<String>) {
    print("Enter the radius of the Circle: ")
    val r = readLine()?.toDoubleOrNull()
    when {
        r == null -> println("Please enter a valid decimal number.")
        r < 0 -> println("Radius cannot be negative.")
        else -> {
            val pi = 3.1416
            val area = pi*r*r
            println("Area of the circle is: $area")
        }
    }
}