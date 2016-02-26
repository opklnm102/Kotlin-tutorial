package grammar

import problems.sum.sum

/**
 * Created by Dong on 2016-02-26.
 */
/*
 * 함수
 * 형태
 * fun 함수명(인자1: 자료형, 인자2: 자료형): 반환형 {
 *      //code
 *      return 반환값
 *  }
 */

//두 정수를 인자로 받아 더해서 반환하는 함수
fun sum1(a: Int, b: Int): Int {
    return a + b
}

//간략하게 표현 가능
fun sum2(a: Int, b: Int) = a + b

//리턴 값이 없는 경우 반환타입을 Unit로 선언
fun sum3(a: Int, b: Int): Unit {
    println(a + b)
}

//인자의 기본값 정의
fun sum4(a: Int = 5, b: Int = 10): Int {
    return a + b
}

fun main(args: Array<String>) {
    var num = sum4(b = 3)
    println(num)
}









