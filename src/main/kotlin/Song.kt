class Song(val title: String, val artist: String, duration: Int) : Playable{
    override val duration = duration
    override fun play(){
    println("Titolo: $title Artista: $artist Durata: $duration s")
    }
}