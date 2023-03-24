class Song constructor(
		val title: String,
        val artist: String,
        val publishedIn: String,
        val playCount: Int
){
    private val isPopular = if (playCount >= 1000){ true } else { false }
    
    fun description (){
        val popular = if (isPopular) {
             	"It is very popular."
        } else {
            "It's unpopular"
        }
        println("$title, performed by $artist, was released in $publishedIn. $popular")
    }
    
}
fun main(){
    val Song1 = Song("mmm", "pedro", "12/10/1004", 1000)
    Song1.description()
}