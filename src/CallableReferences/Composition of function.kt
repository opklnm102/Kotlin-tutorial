package CallableReferences

/**
 * Created by Dong on 2016-02-25.
 */

fun main(args: Array<String>) {
    val oddLenght = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLenght))
}

private fun isOdd(x: Int) = x % 2 != 0
private fun length(s: String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C{
    return { x -> f(g(x)) }
}
