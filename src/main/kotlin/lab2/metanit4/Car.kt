package  lab2.metanit4

class Car(override val model: String, override val number: String) : Movable,Info {
    override var speed = 100
    override fun move() {
        println("Car go with speeed $speed")
    }
}