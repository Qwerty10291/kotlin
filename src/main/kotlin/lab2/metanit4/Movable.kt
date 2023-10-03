package lab2.metanit4

interface Movable {
    var speed: Int
    fun move()
    fun stop() {
        println("Stop")
    }
}