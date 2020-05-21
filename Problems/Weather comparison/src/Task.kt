import kotlin.math.min

data class City(val name: String) {
    var degrees: Int = 0
        get() = field
        set(value) {
            field = if (value < -92 || value > 57) {
                when (name) {
                    "Dubai" -> 30
                    "Moscow" -> 5
                    "Hanoi" -> 20
                    else -> value
                }
            } else {
                value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    when {
        firstCity.degrees == secondCity.degrees && secondCity.degrees == thirdCity.degrees 
        && firstCity.degrees == thirdCity.degrees -> print("neither")
        firstCity.degrees == secondCity.degrees -> print(thirdCity.name)
        firstCity.degrees == thirdCity.degrees -> print(secondCity.name)
        secondCity.degrees == thirdCity.degrees -> print(firstCity.name)
        else -> {
            val minTemp = min(firstCity.degrees, min(secondCity.degrees, thirdCity.degrees))
            print(when (minTemp) {
                firstCity.degrees -> firstCity.name
                secondCity.degrees -> secondCity.name
                thirdCity.degrees -> thirdCity.name
                else -> "Unknow"
            })
        }
    }
}
