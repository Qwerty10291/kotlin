package  lab2.metanit4

abstract class Figure {
    abstract fun perimeter(): Float
    abstract fun area(): Float
}

class Rectangle(val width: Float, val height: Float) : Figure() {
    override fun perimeter(): Float{
        return width * 2 + height * 2;
    }
    override fun area(): Float {
        return width * height;
    }
}