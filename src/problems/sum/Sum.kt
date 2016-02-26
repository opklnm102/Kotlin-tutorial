package problems.sum

/**
 * Created by Dong on 2016-02-25.
 */

fun sum(a: IntArray): Int {
    var sum = 0
    for (x in a) {
        sum += x
    }
    return sum
}

