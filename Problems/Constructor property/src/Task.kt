fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

data class ByteTimer(var time: Int) {
    var timer: Int = time

    init {
        when {
            time < -128 -> time = -128
            time > 127 -> time = 127
            else -> time = timer
        }
    }
}