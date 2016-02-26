package grammar

/**
 * Created by Dong on 2016-02-26.
 */

fun main(args: Array<String>) {

    /*
     * if문 - 자바와 동일
     */
    if(true){
        //code Block
    }else if(true){
        //code Block
    }else{
        //code Block
    }

    /*
     * when - 자바의 switch-case와 비슷한 조건문
     */
    var num = 2
    when(num){
        1 -> {
            println("1")
        }
        2 -> {
            println("2")
        }
        else -> {
            println("no")
        }
    }
}

//인자의 타입이 Any인 경우 모든 타입을 대입할 수 있기 때문에 매우 유연
//code block이 한줄인 경우 중괄호({}) 생략 가능
fun cases(obj: Any){
    when(obj){
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}