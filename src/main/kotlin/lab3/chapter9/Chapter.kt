package lab3.chapter9

class Chapter {
    fun mutableList() {
        val mutableList = mutableListOf("Apple", "Banana", "Cherry")
        mutableList.add("Date")
        mutableList[1] = "Blueberry"
        mutableList.removeAt(2)
        for (fruit in mutableList) {
            println(fruit)
        }
    }
    fun mutableSet() {
        val mutableSet = mutableSetOf("Apple", "Banana", "Cherry")
        mutableSet.add("Banana")
        mutableSet.remove("Cherry")
        val containsBanana = "Banana" in mutableSet
        for (fruit in mutableSet) {
            println(fruit)
        }
    }

    fun mutableMap() {
        val mutableMap = mutableMapOf(
            "apple" to 1,
            "banana" to 2,
            "cherry" to 3
        )

        mutableMap["date"] = 4
        mutableMap.remove("banana")
        val cherryValue = mutableMap["cherry"]
        for ((key, value) in mutableMap) {
            println("$key -> $value")
        }

    }
}