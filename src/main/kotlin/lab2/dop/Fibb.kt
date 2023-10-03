package lab2.dop

class Fibb {
    fun generator() = sequence<Int> {
        var prev = 0
        var curr = 1
        yield(prev)
        while (true){
            val next = prev + curr
            yield(next)
            prev = curr
            curr = next
        }
    }
}