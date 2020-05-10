import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val op = scanner.next()
    val b = scanner.nextLong()

    when (op) {
        "+" -> print(a + b)
        "-" -> print(a - b)
        "*" -> print(a * b)
        "/" -> {
            if (b != 0.toLong()) {
                print(a / b)
            } else {
                print("Division by 0!")
            }
        }
        else -> print("Unknown operator")
    }
    // write your code here
}