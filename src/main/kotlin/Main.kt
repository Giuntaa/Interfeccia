fun player(playable: List<Playable>){
    playable.forEach {it.play()}
}

fun main() {
    var playable : MutableList<Playable> = mutableListOf(Song("DAWG","BIGFRA", 1200), Video("BIGFRA si butta da un palazzo di 30 piani", 4, "1080p"),Song("La FINE", "BIGFRA", 2400))
    player(playable)
}