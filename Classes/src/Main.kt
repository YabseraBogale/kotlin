
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Person(val name:String){
    private val firstName:String
    init {
        this.firstName=name
    }
    fun Name()=this.firstName
}
fun main() {
        val yabsera=Person("Yabsera")
        println(yabsera.Name())
        println(yabsera.name)
}