package lab2.metanit4

open class Video {
    open fun play() {
        println("Play video")
    }
}

interface AudioPlayer {
    fun play() {
        println("Play audio")
    }
}

class MediaPlayer() : Video(), AudioPlayer {
    override fun play() {
        super<Video>.play()
        super<AudioPlayer>.play()
    }
}