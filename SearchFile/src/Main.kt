import java.io.File

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val currentFile=File(".")
    for(k in currentFile.list()){
        println(k)
    }
}