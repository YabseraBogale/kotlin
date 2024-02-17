
fun main() {
    // is immutable array since it is val?
    val onttofive= arrayOf(1,2)
    // onttofive[1]=4 doesn't wok
    println("returns the address ${onttofive}")
    println("array size ${onttofive.size}")
    println("array count ${onttofive.count()}")
    // what about list is immutable list since listOf is imuutable
    val ontosix= listOf(1,2,3,4)
    println("returns the list ${ontosix}")
    println("list size ${ontosix.size}")
    println("list count ${ontosix.count()}")
    println("contains 2 in list ${ontosix.contains(2)}")
    println("adding 5 and 6")
    // mutable since it is var
    var one= arrayOf(1)
    println("before ${one[0]}")
    one[0]=2
    // use mutableListOf method to ceate list that are immutable
    println("after ${one[0]}")
    var two= mutableListOf(1)
    println("before ${two}")
    two[0]=2
    println("after ${two}")
    two.add(3)
    print("added 3 to the list ${two}")

}