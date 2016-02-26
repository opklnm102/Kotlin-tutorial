package grammar

/**
 * Created by Dong on 2016-02-26.
 */
/*
 * 람다
 * Higher-Order Function(함수를 인자로 받는 함수)
 *
 * 형식
 * (인자1 타입, 인자2 타입...) -> 반환형
 */

//인자도 없고 반환도 하지 않는 함수
fun myFunc(arg: () -> Unit) {
}

//정수 2개 받고, 반환은 하지 않는 함수
fun myFunc2(arg: (Int, Int) -> Unit) {
}

//정수 2개를 받고, 정수를 반환하는 함수
fun myFunc3(arg: (Int, Int) -> Int) {
}

//정수 2개를 인자로 받아 정수를 반환하는 함수를 인자로 받아 실행한 후 결과 반환
//인자로 받은 함수를 실행할 때는 invoke() 사용
//invoke()의 인자는 인자로 받은 함수의 인자의 타입과 동일
fun myFunc4(arg: (Int, Int) -> Int): Int {
    var result: Int = arg.invoke(5, 10)
    return result
}

fun main(args: Array<String>) {
    myFunc(arg = {
        //code Block
    })

    myFunc2(arg = { x: Int, y: Int ->
        //code Block
    })

    myFunc3(arg = { x: Int, y: Int -> x + y })

    var result = myFunc4({ x, y -> x * y })
    println(result)

    //Thread 클래스는 인자, 반환값이 없는 타입의 함수를 생성자를 받아 그 함수를 쓰레드에 올린다.
    Thread({
        print("Hello Thread")
    }).start()

}
