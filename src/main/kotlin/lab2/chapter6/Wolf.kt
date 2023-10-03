package lab2.chapter6

class Wolf : Canine() {
    override val image = "wolf.png"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("AUUUUUUUUUUUUUUUUUUF!!!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}