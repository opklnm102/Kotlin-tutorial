package grammar

import java.util.*

/**
 * Created by Dong on 2016-02-26.
 */
/*
 * 배열
 * Array클래스로 표현
 */
fun main(args: Array<String>) {

    //사이즈가 정해진 빈 배열 선언
    //var arr: Array<T> = Array<T>(size: Int)

    //람다식 이용
    //var arr: Array<Int> = Array<Int>(5,i -> i + 5)  //[5, 6, 7, 8, 9]

    //특정한 값들을 넣은 배열 만들기 - arrayOf() 이용
    var arr: Array<String> = arrayOf("aaa", "bbb", "ccc")

    //각각의 기본자료형을 표현할 수 있는 별도의 배열들
    var intArr: IntArray = intArrayOf(1, 2, 3, 4)  //정수배열
    var doubleArr: DoubleArray = doubleArrayOf(1.3, 2.2, 3.3, 4.4)  //실수배열
    var booleanArr: BooleanArray = booleanArrayOf(true, false, true)  //논리배열
    var charArr: CharArray = charArrayOf('a', 'b', 'c')  //문자배열

    //범위(range)
    //일정한 값들의 범위를 range()을 적용해 지정
    for(idx in 1..5){
        println(idx)
    }

    //문자도 된다.
    for(idx in 'a'..'e'){
        println(idx)
    }

    //변수도 된다.
    var end = 10
    for(idx in 6..end){
        println(idx)
    }

    var start = 1
    for(idx in start..5){
        println(idx)
    }

    /*
     * ArrayList - java.util.ArrayList<E> 클래스 이용
     * Kotlin.List<E> 인터페이스 상속 - 읽기 전용
     */
    //빈 ArrayList 선언
    var list = arrayListOf<String>()

    var list2 = arrayListOf<String>("aaa", "bbb", "ccc")

    //값의 추가와 호출
    list.add("fff")  // == list[0] = "fff"
    var value = list.get(0)  // == var value = list[0]

    /*
     * LinkedList
     */
    var linkList = LinkedList<String>()
    linkList.add("value")  // == linkList[0] = "value"
    println(linkList[0])

    /*
     * HashMap
     */
    var map = hashMapOf<String, String>()  //빈 HashMap 생성
    var map2 = HashMap<String, String>()  //빈 HashMap 생성

    //값이 있는 HashMap 생성
    //인자로 키와 값을 의미하는 Pair인스턴스를 받는다.
    var map3 = hashMapOf<String, String>(Pair("key", "value"), Pair("dong", "1111"))

    map3.put("name","hee")
    var value2 = map3.get("name")

    /*
     * if문에서의 in
     * in 앞에 있는 값이 in의 뒤에 있는 Collection에 속해있는지의 여부를 리턴
     * Map의 경우 키를 가지고 있는지의 여부를 의미
     */
    var list3 = listOf<String>("a", "b", "c")
    if("c" in list3)
        println("yes")  //"c"가 리스트에 속해 있으므로 yes출력

    if("dong" in map3)
        println("yes")  //"dong"가 map의 키에 속해 있으므로 yes출력

    /*
     * for문에서의 in
     * in의 앞엤는 변수에 in의 뒤에 있는 Collection들의 값을 하나하나 담아 반복
     * Map의 경우 Pair의 인스턴스들을 담아 반복
     */
    for(value in list)
        println(value)

    for(p in map3)
        println("${p.key} : ${p.value}")

    for((key, value) in map3)
        println("${key} : ${value}")

    /*
     * Collections 연산
     */
    //filter()로 "Park"로 시작하는 문자열을 고르고, forEach()로 각 요소를 출력
    var list5 = listOf<String>("ParkJS", "JungHL", "ParkYH", "NoEH")  //읽기 전용 List반환(add()가 없다)
    list5.filter { str -> str.startsWith("Park") }.forEach { str -> println(str) }
}

