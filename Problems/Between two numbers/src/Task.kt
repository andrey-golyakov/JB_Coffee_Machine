import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a = arrayOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    print(a[0] in a[1]..a[2])
}
