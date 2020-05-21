class Cat(val name: String) {

    /** The current state of the cat (by default a cat doesn't sleep). */
    var sleeping: Boolean = false

    /**
     * A cat says "meow" if it is not sleeping, otherwise, it says "zzz".
     * When a cat says "meow", it can sometimes fall asleep.
     */
    fun say() {
        if (sleeping) {
            println("zzz")
        } else {
            println("meow")

            if (Math.random() < 0.5) {
                sleeping = true
            }
        }
    }

    /** The function wakes the cat. */
    fun wakeUp() {
        sleeping = false
    }
}

fun main() {
    //val pharaoh = Cat("Pharaoh")  // Create a cat named "Pharaoh"

    repeat (5) {
        Cat("Pharaoh").say()  // it says "meow" or "zzz"
    }

    Cat("Pharaoh").wakeUp()  // wake the cat up
    Cat("Pharaoh").say()  // it says "meow"
}