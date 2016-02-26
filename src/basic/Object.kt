package basic

/**
 * Created by Dong on 2016-02-25.
 */

class Greeter(val name: String){
    fun greet(){
        println("Hello, ${name}")
    }
}

fun main(args: Array<String>){
    Greeter("fdfd").greet()
}
