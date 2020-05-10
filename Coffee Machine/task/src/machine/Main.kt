package machine
import java.util.*
import kotlin.math.min

fun printResult(water: Int, milk: Int, beans: Int, cups:Int, money: Int): String {
    val str = "The coffee machine has:\n" +
            "$water of water\n" +
            "$milk of milk\n" +
            "$beans of coffee beans\n" +
            "$cups of disposable cups\n" +
            "$money of money\n"
    return str
}

fun main() {
    val scanner = Scanner(System.`in`)
    val (hasWater, hasMilk, hasBeans, hasCups, hasMoney) = arrayOf(400, 540, 120, 9, 550)
    val (espressoWater, espressoBeans, espressoMoney) = arrayOf(250, 16, 4)
    val (latteWater, latteMilk, latteBeans, latteMoney) = arrayOf(350, 75, 20, 7)
    val (cappuccinoWater, cappuccinoMilk, cappuccinoBeans, cappuccinoMoney) = arrayOf(200, 100, 12, 6)

    println(printResult(hasWater, hasMilk, hasBeans, hasCups, hasMoney))
    println("Write action (buy, fill, take): ")

    val action = scanner.nextLine()

    when (action) {
        "buy" -> {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
            val whatBuy = scanner.nextInt()
            when (whatBuy) {
                1 -> println(printResult(hasWater - espressoWater, hasMilk, hasBeans - espressoBeans, hasCups - 1, hasMoney + espressoMoney))
                2 -> println(printResult(hasWater - latteWater, hasMilk - latteMilk, hasBeans - latteBeans, hasCups - 1, hasMoney + latteMoney))
                3 -> println(printResult(hasWater - cappuccinoWater, hasMilk - cappuccinoMilk, hasBeans - cappuccinoBeans, hasCups - 1, hasMoney + cappuccinoMoney))
            }
        }
        "fill" -> {
            println("Write how many ml of water do you want to add: ")
            val howWaterFill = scanner.nextInt()
            println("Write how many ml of milk do you want to add: ")
            val howMilkFill = scanner.nextInt()
            println("Write how many grams of coffee beans do you want to add: ")
            val howBeansFill = scanner.nextInt()
            println("Write how many disposable cups of coffee do you want to add: ")
            val howCupsFill = scanner.nextInt()
            println(printResult(hasWater + howWaterFill, hasMilk + howMilkFill, hasBeans + howBeansFill, hasCups + howCupsFill, hasMoney))
        }
        "take" -> {
            println("I gave you \$$hasMoney\n")
            println(printResult(hasWater, hasMilk, hasBeans, hasCups, hasMoney - hasMoney))

        }
        else -> print("Unknow action")
    }
}