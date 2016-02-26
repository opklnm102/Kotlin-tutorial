package basic

/**
 * Created by Dong on 2016-02-25.
 */

fun main(args: Array<String>) {
    cases("Hello")
    cases(1)
    cases(System.currentTimeMillis())
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass() {

}