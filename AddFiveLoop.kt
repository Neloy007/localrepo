fun main() {
    var sum = 0

    var i = 0
    while (i < 10) {
        println("Enter number ${i+1}: ")
        
        val number = readLine()?.toIntOrNull()

        if (number != null) {
            sum += number
            i++
        }else{
            println("Please enter a valid Integer.")
        }


        if (i == 5) {
            break
        }
    }


    println("The sum of the 5 numbers is: $sum")
}
