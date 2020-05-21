package machine

import java.util.*

enum class Product(val id: Int, val water: Int, val milk: Int, val beans: Int, val money: Int) {
    ESPRESSO(1, 250, 0, 16, 4),
    LATTE(2, 350, 75, 20, 7),
    CAPPUCCINO(3, 200, 100, 12, 6),
    NULL(0, 0, 0, 0, 0);

    companion object {
        fun findItem(id: Int): Product {
            for (item in values()) {
                if (id == item.id) return item
            }
            return NULL
        }
    }
}

class CoffeeMachine {
    var state = "No activity"

    fun inputData(): String {
        val input = Scanner(System.`in`)
        val data = input.nextLine()
        return data
    }

    fun reState(str: String) {
        this.state = str;

    }

    fun printResult(water: Int, milk: Int, beans: Int, cups: Int, money: Int): String {
        val str = "\nThe coffee machine has:\n" +
                "$water of water\n" +
                "$milk of milk\n" +
                "$beans of coffee beans\n" +
                "$cups of disposable cups\n" +
                "\$$money of money"
        return str
    }
}

fun main(args: Array<String>) {
    val coffeeMachine = CoffeeMachine()
    val espresso = Product.findItem(1)
    val latte = Product.findItem(2)
    val cappuccino = Product.findItem(3)
    var (hasWater, hasMilk, hasBeans, hasCups, hasMoney) = arrayOf(400, 540, 120, 9, 550)

    coffeeMachine.reState("start");

    while (coffeeMachine.state !== "") {
        when (coffeeMachine.state) {
            "start" -> {
                print("\nWrite action (buy, fill, take, remaining, exit): ")
                coffeeMachine.reState(coffeeMachine.inputData());
            }
            "buy" -> {
                print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                when (coffeeMachine.inputData()) {
                    "1" -> {
                        if (hasWater >= espresso.water && hasBeans >= espresso.beans && hasCups > 0) {
                            println("I have enough resources, making you a coffee!")
                            hasWater -= espresso.water
                            hasBeans -= espresso.beans
                            hasCups--
                            hasMoney += espresso.money
                        } else if (hasWater < espresso.water) {
                            println("Sorry, not enough water!")
                        } else if (hasBeans < espresso.beans) {
                            println("Sorry, not enough coffee beans!")
                        } else {
                            println("Sorry, not enough cups!")
                        }
                        coffeeMachine.reState("start");
                    }
                    "2" -> {
                        if (hasWater >= latte.water && hasBeans >= latte.beans && hasMilk >= latte.milk && hasCups > 0) {
                            println("I have enough resources, making you a coffee!")
                            hasWater -= latte.water
                            hasBeans -= latte.beans
                            hasMilk -= latte.milk
                            hasCups--
                            hasMoney += latte.money
                        } else if (hasWater < latte.water) {
                            println("Sorry, not enough water!")
                        } else if (hasBeans < latte.beans) {
                            println("Sorry, not enough coffee beans!")
                        } else if (hasMilk < latte.milk) {
                            println("Sorry, not enough milk!")
                        } else {
                            println("Sorry, not enough cups!")
                        }
                        coffeeMachine.reState("start");
                    }
                    "3" -> {
                        if (hasWater >= cappuccino.water && hasBeans >= cappuccino.beans && hasMilk >= cappuccino.milk && hasCups > 0) {
                            println("I have enough resources, making you a coffee!")
                            hasWater -= cappuccino.water
                            hasBeans -= cappuccino.beans
                            hasMilk -= cappuccino.milk
                            hasCups--
                            hasMoney += cappuccino.money
                        } else if (hasWater < cappuccino.water) {
                            println("Sorry, not enough water!")
                        } else if (hasBeans < cappuccino.beans) {
                            println("Sorry, not enough coffee beans!")
                        } else if (hasMilk < cappuccino.milk) {
                            println("Sorry, not enough milk!")
                        } else {
                            println("Sorry, not enough cups!")
                        }
                        coffeeMachine.reState("start");
                    }
                    "back" -> coffeeMachine.reState("start");
                }
            }
            "fill" -> {
                print("\nWrite how many ml of water do you want to add: ")
                hasWater += coffeeMachine.inputData().toInt()
                print("Write how many ml of milk do you want to add: ")
                hasMilk += coffeeMachine.inputData().toInt()
                print("Write how many grams of coffee beans do you want to add: ")
                hasBeans += coffeeMachine.inputData().toInt()
                print("Write how many disposable cups of coffee do you want to add: ")
                hasCups += coffeeMachine.inputData().toInt()
                coffeeMachine.reState("start");
            }
            "take" -> {
                println("\nI gave you \$$hasMoney")
                hasMoney -= hasMoney
                coffeeMachine.reState("start");
            }
            "remaining" -> {
                println(coffeeMachine.printResult(hasWater, hasMilk, hasBeans, hasCups, hasMoney))
                coffeeMachine.reState("start");
            }
            "exit" -> {
                coffeeMachine.reState("");
            }
            else -> coffeeMachine.reState("");
        }
    }
}