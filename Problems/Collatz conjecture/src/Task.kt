import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var i = scanner.nextInt()
    print("$i ")
    while (i != 1) {
        if (i % 2 == 0) i /= 2 else i = i * 3 + 1
        print("$i ")
    }
}