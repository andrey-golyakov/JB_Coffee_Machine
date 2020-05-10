import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var (a, b, c) = arrayOf(0, 0, 0)
    repeat(n) {
        val x = scanner.nextInt()
        when (x) {
            0 -> a++
            1 -> b++
            -1 -> c++
        }
    }
    print("$a $b $c")
}
