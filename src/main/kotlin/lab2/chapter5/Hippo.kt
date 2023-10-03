package lab2.chapter5

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("grank grank grang")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }



}