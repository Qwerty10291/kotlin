package lab3.dop


class OuterClassInner {
    private val outerField = 10
    fun Run() {
        val outer = OuterClassInner()
        val inner = outer.InnerClass()
        inner.display()
    }
    inner class InnerClass {
        fun display() {
            println("Value of outerField: ${this@OuterClassInner.outerField}")
        }
    }
}


class OuterClassNested {
    private val staticOuterField = 20

    class NestedClass {
        fun display() {
            println("cannot get staticOuterField from OuterClassNested")
        }
    }
}