import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    when {
        (n > 0) && (n < 9) -> print("1")
        (n > 10) && (n < 99) -> print("2")
        (n > 100) && (n < 999) -> print("3")
        (n > 1000) && (n < 9999) -> print("4")
    }
}