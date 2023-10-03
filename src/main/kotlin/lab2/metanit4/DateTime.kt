package  lab2.metanit4
interface Printable{
    fun printName()
}
enum class DateTime: Printable{
    DAY{
        override fun printName(){
            println("День")
        }
    },
    NIGHT{
        override fun printName(){
            println("Ночь")
        }
    }
}