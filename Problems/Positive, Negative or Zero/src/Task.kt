import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    when {
        a < 0 -> print("negative")
        a == 0 -> print("zero")
        a > 0 -> print("positive")
    }
}