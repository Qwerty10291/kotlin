package lab3.chapter8


class Wolf{

    var name: String = ""
}
class Chapter {
    fun nullUsage() {
        var w: Wolf?  = Wolf()
        println("name: ${w?.name}")
        w?.name = "new name"
        w = null
        println("name null: ${w?.name}")

        var name: String? = "John"
        name = null // Ок, так как тип String? позволяет хранить null

        val length = name?.length // length будет null, если name равно null
        name = null
        val nameLength = name?.length ?: 0 // Если name равно null, то namelength будет равно 0

        if (name != null) {
            println("длина имени: ${name.length}") // Этот блок выполнится только, если name не равно null
        } else {
            println("name равно null")
        }

        name?.let {
            println("длина имени: ${name.length}") // Этот блок выполнится только, если name не равно null
        }

    }

    fun del(a: Int, b: Int): Int {
        if (b == 0) {
            throw ArithmeticException("Деление на ноль недопустимо")
        }
        return a / b
    }

    fun exceptions() {
        try{
            val res = this.del(10, 0)
            println("результат $res")
        } catch (e:java.lang.ArithmeticException) {
            println("Произошла ошибка: ${e.message}")
            e.printStackTrace()
        } finally {
            println("Этот блок всегда выполняется")

        }
    }

}