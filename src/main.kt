//song catalog
fun main() {
    val song = Song("This Is The Kingdom", "Skillet", 2019, 20000)

}

class Song(
    val title : String,
    val artist : String,
    val yearPublished : Int,
    val playCount : Int
){
    val isPopular : Boolean
        get() = playCount >= 1000

    fun printDescription(){
        println("$title, performed by $artist, was released in $yearPublished")
    }
}

