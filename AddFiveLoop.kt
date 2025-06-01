fun main() {
    var sum = 0

    var i = 0
    while (i < 5) {
        println("Enter number ${i+1}: ")
        
        val number = readLine()?.toIntOrNull()

         when {
           number == null -> println("Please enter a valid number.")
           else -> {
               sum += number
               i++
           }
    }

    println("The sum of the 5 numbers is: $sum")
}
