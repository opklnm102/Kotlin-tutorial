package CallableReferences

/**
 * Created by Dong on 2016-02-25.
 */

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))
}

private fun isOdd(x: Int) = x % 2 != 0
