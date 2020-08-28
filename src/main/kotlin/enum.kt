fun main(){
    val colorRed: Color = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
    println(colorRed)
    println(colorGreen)
    println(colorBlue)

}
enum class Color(val value: Int){
    RED(0xff0000),
    GREEN(0x00ff00),
    BLUE(0x0000ff)
}