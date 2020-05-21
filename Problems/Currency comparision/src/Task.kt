import java.util.*

enum class Country(val cur: String) {
    GERMANY("Euro"),
    MALI("CFA franc"),
    DOMINICA("Eastern Caribbean dollar"),
    CANADA("Canadian dollar"),
    SPAIN("Euro"),
    AUSTRALIA("Australian dollar"),
    BRAZIL("Brazilian real"),
    SENEGAL("CFA franc"),
    FRANCE("Euro"),
    GRENADA("Eastern Caribbean dollar"),
    KIRIBATI("Australian dollar");

    companion object {
        fun checkCountry(country: String): String {
            for (enum in values()) {
                if (country.toUpperCase() == enum.name) return enum.cur
            }
            return "Unknow"
        }
    }
}

fun compare(first: String, second: String): Boolean {
    return when {
        first == "Unknow" || second == "Unknow" -> false
        first == second -> true
        else -> false
    }
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val first = Country.checkCountry(scanner.next())
    val second = Country.checkCountry(scanner.next())

    println(compare(first, second))
}
