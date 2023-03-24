open class Phone(var isScreenLightOn Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    
    open fun switchOff() {
        isScreenLightOn = false
    }
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) on else off
        println(The phone screen's light is $phoneScreenLight.)
    }
}

class FoldablePhone()  Phone(){
    var isFolded Boolean = true
    	private set
    
    fun foldIt(folding Boolean){
        isFolded = folding
        if(isFolded){
            println(Folding...Turning off display)
            switchOff()
            return
        }
        println(Opening...Turning on display)
        switchOn()
    }
    override fun switchOn(){
        if(isFolded) {
            println(Cannot turn on becouse its folded. ) 
            return
        }
        super.switchOn()
    }
    override fun switchOff(){
        if(!isScreenLightOn){
            println(Its turned off. )             
        }
        super.switchOff()
        
    }
    
}
fun main(){
    val fold = FoldablePhone();
    fold.foldIt(false)
    fold.switchOff()
    fold.switchOff()
    fold.switchOn()
    fold.foldIt(true)
    fold.switchOn()
    
}