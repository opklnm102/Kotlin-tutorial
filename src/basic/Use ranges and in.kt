package basic

/**
 * Created by Dong on 2016-02-25.
 */

fun main(args: Array<String>) {
    val x = Integer.parseInt("5")

    val y = 10
    if (x in 1..y - 1)
        println("OK")

    for (a in 1..5)
        print("${a}")

    println()
    val array = arrayListOf<String>();
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")

    if (x !in 0..array.size - 1)
        println("Out: array has only ${array.size} elements. x = ${x}")

    if("aaa" in array)
        println("Yes aaa")



}