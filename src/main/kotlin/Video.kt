class Video( val title: String, duration: Int, val resolution: String) : Playable{
    override val duration = duration
    override fun play(){
        println("Titolo: $title Risoluzione: $resolution Durata: $duration s")
    }
}