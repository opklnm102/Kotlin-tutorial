package grammar

/**
 * Created by Dong on 2016-02-26.
 */

fun main(args: Array<String>) {

    /*
     * 문자열 템플릿
     * 변수를 별도의 문법 추가 없이 문자열에 출력 가능
     */
    var str: String = "Hello"
    print("${str} World!")

    /*
     * 간략하게 표현 가능
     */

    fun sum(a: Int, b: Int) = a + b

    /*
     * 타입 오토 캐스팅
     * 타입을 유추하여 자동으로 캐스팅해주기 때문에 유연
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            //obj는 String타입이라 밝혀졌기 때문에 String 타입으로 자동 캐스팅
            return obj.length
        }
        return null
    }

    /*
     * Null 검사
     * Java에서 Null 객체의 메소드를 호출하면 NullPointerException이 발생
     * 코틀린에서는 미리 Null검사를 함으로써 Null상태면 Null반환
     */
    var files = java.io.File("Z:\\").list()  //없는 경로이므로 Null반환
    println(files?.size)  //files가 null이므로 메소드는 호출되지 않고 null 출력

    /*
     * Null 핸들링
     * 객체의 상태가 Null이라면 바로 Null값을 반환하지 않도록 핸들링이 가능
     * 값의 검사를 하여 Null인 경우 ?:키워드를 통해 수행할 행동을 정의
     */
    println(files?.size ?: "empty")  //files가 null이므로 "empty"가 출력
    var state = files ?: "empty"  //값을 담을 수도 있다.

    //값이 null이 아닌 경우 수행할 동작을 정의
    files?.let {
        println("files is not null!!")
    }

    /*
     * 확장 함수
     * 기존 클래스에 우리가 함수를 새로 추가할 수 있다.
     */
    fun String.newMethod(): String {
        return "new Method!!"
    }

    var str5: String = ""
    println(str5.newMethod())

    /*
     * 변수에 if문 사용
     * Java에서는 변수에 값을 넣는데 조건을 주려면 삼항연산자를 써야했지만
     * 코틀린에서는 if문으로 가능
     */
    fun foo(param: Int) {
        val result = if (param == 1) {
            "one"
        } else {
            "two"
        }
    }

    /*
     * is키워드
     * Java의 instanceOf()와 같은 키워드로 변수나 상수의 타입을 알아볼 때 사용
     */
    if ("aaa" is String) {
        println("true")
    }
    var v = 10
    if (v is Int) {
        println("true")
    }
}




