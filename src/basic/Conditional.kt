package basic

/**
 *
 * Created by Dong on 2016-02-25.
 */

fun main(args: Array<String>) {
    println(max(Integer.parseInt("5"), Integer.parseInt("10")))
}

fun max(a: Int, b: Int) = if(a>b) a else b