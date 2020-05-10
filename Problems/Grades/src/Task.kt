import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var (d, c, b, a) = arrayOf(0, 0, 0, 0)
    repeat(n) {
        val x = scanner.nextInt()
        when (x) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    print("$d $c $b $a")
}
