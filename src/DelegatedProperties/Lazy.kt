package DelegatedProperties

/**
 * Created by Dong on 2016-02-25.
 */

class LazySample{
    val lazy: String by lazy{
        println("computed!")
        "my lazy"
    }
}

fun main(args: Array<String>) {
    val sample = LazySample()
    println("lazy = ${sample.lazy}")
    println("lazy = ${sample.lazy}")
}
