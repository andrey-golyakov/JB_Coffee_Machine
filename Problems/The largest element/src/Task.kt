import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n = 1
    var i = 0
    while (n != 0) {
        n = scanner.nextInt()
        if (n > i) i = n
    }
    print(i)
}
