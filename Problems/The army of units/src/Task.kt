import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val unit = scanner.nextInt()
    // write your code here
    when {
        unit < 1 -> print("no army")
        unit in 1..4 -> print("few")
        unit in 5..9 -> print("several")
        unit in 10..19 -> print("pack")
        unit in 20..49 -> print("lots")
        unit in 50..99 -> print("horde")
        unit in 100..249 -> print("throng")
        unit in 250..499 -> print("swarm")
        unit in 500..999 -> print("zounds")
        unit >= 1000 -> print("legion")
    }
}