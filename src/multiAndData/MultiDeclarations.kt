package multiAndData

/**
 * Created by Dong on 2016-02-25.
 */

fun main(args: Array<String>) {
    val pair = Pair(1, "one")

    val(num, name) = pair

    println("num = $num, name = $name")

}

class Pair<K,V>(val first: K, val second: V){
    operator fun component1(): K{
        return first
    }

    operator fun component2(): V{
        return second
    }
}