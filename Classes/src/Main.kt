
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Person(val name:String){
    init {
        require(name.trim().length>0){ "Invalid input"}
    }
}
fun main() {
        val yabsera=Person("Yabsera")
        println(yabsera.name)
}