fun main(args: Array<String>) {
    print("Enter the first Number: ")
    val numOne = readLine()!!.toDouble()
    print("Enter the second Number: ")
    val numTwo = readLine()!!.toDouble()
    print("Enter the operator(+, -, *, /, %): ")
    val oper = readLine()
    when{
        oper == "+" -> print("Addition is: ${numOne+numTwo}")
        oper== "-" -> print("Subtraction is: ${numOne-numTwo}")
        oper == "*" -> print("Multiplication is: ${numOne*numTwo}")
        oper == "/" -> {
            if (numTwo != 0.0) {
                print("Division is: ${numOne / numTwo}")
            } else {
                print("Undefined. Cannot Devide by Zero.")
            }
        }
        oper == "%" -> {
            if (numTwo != 0.0) {
                print("Modulus is: ${numOne % numTwo}")
            } else {
                print("Undefined. Cannot Devide by Zero.")
            }
        }

    }
}