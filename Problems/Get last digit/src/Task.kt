import java.util.*

// write your code here
fun getLastDigit(a: Int): Int {
    var num = a % 10
    if (num < 0) {
        num = num * -1
    }
    return num
}

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}