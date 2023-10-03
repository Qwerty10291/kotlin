package lab2.chapter6

abstract class Animal : Roamble {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()
    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }

}