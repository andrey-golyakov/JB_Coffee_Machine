import java.lang.Math.cbrt
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val population = scanner.nextInt().toDouble()
    val assembly = cbrt(population).toInt()

    print(assembly)
}
