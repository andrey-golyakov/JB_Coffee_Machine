import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var i = 0
    do {
        val n = scanner.nextInt()
        i++
    } while (n != 0)
    print(i - 1)
}