//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val onetonine=1..9

    for(k in onetonine){
        println(k)
    }
    //println(onetonine is IntRange)
    var one= arrayOf(onetonine)
    //println(onetonine.last)
    //println(onetonine.first)
    for(index in one.indices){
        println(one[index].toString())
    }
}