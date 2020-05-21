enum class DangerLevel(val number: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun getLevel(): Int {
        return valueOf(name).number
    }
}