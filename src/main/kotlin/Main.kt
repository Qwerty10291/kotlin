import lab2.dop.BubbleSort
import lab2.dop.Fibb
import kotlin.random.Random



fun main() {
    val randomArr = MutableList(10) { Random.nextInt(1, 101) }
    println(randomArr)
    BubbleSort<Int>().sort(randomArr)
    println(randomArr)

    println(Fibb().generator().take(10).toList())
}
