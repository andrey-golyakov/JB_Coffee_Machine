package machine
import java.util.*

fun printResult(water: Int, milk: Int, beans: Int, cups:Int, money: Int): String {
    val str = "\nThe coffee machine has:\n" +
            "$water of water\n" +
            "$milk of milk\n" +
            "$beans of coffee beans\n" +
            "$cups of disposable cups\n" +
            "$money of money"
    return str
}
fun action(): String {
    val scanner = Scanner(System.`in`)
    print("\nWrite action (buy, fill, take, remaining, exit): ")
    return scanner.nextLine()
}

fun main() {
    val scanner = Scanner(System.`in`)
    var (hasWater, hasMilk, hasBeans, hasCups, hasMoney) = arrayOf(400, 540, 120, 9, 550)
    val (espressoWater, espressoBeans, espressoMoney) = arrayOf(250, 16, 4)
    val (latteWater, latteMilk, latteBeans, latteMoney) = arrayOf(350, 75, 20, 7)
    val (cappuccinoWater, cappuccinoMilk, cappuccinoBeans, cappuccinoMoney) = arrayOf(200, 100, 12, 6)
    var action = action()

    while (action !== "") {
        when (action) {
            "buy" -> {
                print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                val whatBuy = scanner.nextLine()
                when (whatBuy) {
                    "1" -> {
                        if (hasWater >= espressoWater && hasBeans >= espressoBeans && hasCups > 0) {
                            println("I have enough resources, making you a coffee!")
                            hasWater -= espressoWater
                            hasBeans -= espressoBeans
                            hasCups--
                            hasMoney += espressoMoney
                        } else if (hasWater < espressoWater) {
                            println("Sorry, not enough water!")
                        } else if (hasBeans < espressoBeans) {
                            println("Sorry, not enough coffee beans!")
                        } else {
                            println("Sorry, not enough cups!")
                        }
                        action = action()
                    }
                    "2" -> {
                        if (hasWater >= latteWater && hasBeans >= latteBeans && hasMilk >= latteMilk && hasCups > 0) {
                            println("I have enough resources, making you a coffee!")
                            hasWater -= latteWater
                            hasBeans -= latteBeans
                            hasMilk -= latteMilk
                            hasCups--
                            hasMoney += latteMoney
                        } else if (hasWater < latteWater) {
                            println("Sorry, not enough water!")
                        } else if (hasBeans < latteBeans) {
                            println("Sorry, not enough coffee beans!")
                        } else if (hasMilk < latteMilk) {
                            println("Sorry, not enough milk!")
                        } else {
                            println("Sorry, not enough cups!")
                        }
                        action = action()
                    }
                    "3" -> {
                        if (hasWater >= cappuccinoWater && hasBeans >= cappuccinoBeans && hasMilk >= cappuccinoMilk && hasCups > 0) {
                            println("I have enough resources, making you a coffee!")
                            hasWater -= cappuccinoWater
                            hasBeans -= cappuccinoBeans
                            hasMilk -= cappuccinoMilk
                            hasCups--
                            hasMoney += cappuccinoMoney
                        } else if (hasWater < cappuccinoWater) {
                            println("Sorry, not enough water!")
                        } else if (hasBeans < cappuccinoBeans) {
                            println("Sorry, not enough coffee beans!")
                        } else if (hasMilk < cappuccinoMilk) {
                            println("Sorry, not enough milk!")
                        } else {
                            println("Sorry, not enough cups!")
                        }
                        action = action()
                    }
                    "back" -> action = action()
                }
            }
            "fill" -> {
                print("\nWrite how many ml of water do you want to add: ")
                val howWaterFill = scanner.nextInt()
                print("Write how many ml of milk do you want to add: ")
                val howMilkFill = scanner.nextInt()
                print("Write how many grams of coffee beans do you want to add: ")
                val howBeansFill = scanner.nextInt()
                print("Write how many disposable cups of coffee do you want to add: ")
                val howCupsFill = scanner.nextInt()
                hasWater += howWaterFill
                hasMilk += howMilkFill
                hasBeans += howBeansFill
                hasCups += howCupsFill
                action = action()
            }
            "take" -> {
                println("\nI gave you \$$hasMoney")
                hasMoney -= hasMoney
                action = action()
            }
            "remaining" -> {
                println(printResult(hasWater, hasMilk, hasBeans, hasCups, hasMoney))
                action = action()
            }
            "exit" -> {
                action = ""
            }
            else -> action = ""
        }
    }
}