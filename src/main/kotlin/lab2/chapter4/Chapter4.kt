package lab2.chapter4

class Dog (val name: String, var weight: Int, val breed: String) {
    fun bark(){
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

class Dog2 (val name: String, var weight: Int, breed_param: String) {
    init {
        println("Dog $name has been created")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed")
    }

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

class Dog3 (val name: String, weight_param: Int, breed_param: String) {
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    var weight = weight_param
        set(value){
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = weight / 2.2

    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

class DrumKit(var hasTopHat: Boolean, var hasShare: Boolean) {
    fun playTopHat() {
        if (hasTopHat) println("ding ding BA-DA-BING!")
    }
    fun playShare() {
        if (hasShare) println("BANG BANG BANG!")
    }
}

class Duck {
    fun quack() {
        println("quack! quack! quack!")
    }
}

class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }
    fun stop() {
        println("Stopped playing $title")
    }
}

class Chapter4 {
}