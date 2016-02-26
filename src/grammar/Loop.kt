package grammar

/**
 * Created by Dong on 2016-02-26.
 */

fun main(args: Array<String>) {

    /*
     * for문 - 기본형은 forEach문
     */
    var arr: Array<String> = arrayOf("a", "b", "c")  //배열 생성
    for (a in arr) {
        println(a)
    }

    //인덱스로 요소를 뽑아오고 싶다면
    var arr2: Array<String> = arrayOf("a", "b", "c")
    for (idx in arr.indices) {
        println(arr2[idx])
    }

    /*
     * while문 - Java와 동일
     */
    var arr3: Array<String> = arrayOf("a", "b", "c")
    var i = 0
    while (i < arr3.size) {
        println(arr[i])
        i++
    }

    /*
     * do-while - Java와 동일
     */
    var arr4: Array<String> = arrayOf("a", "b", "c")
    var j = 0
    do{
        println(arr[j])
        j++
    }while(j < arr4.size)

    /*
     * continue & break - 반복에 대한 제어
     */
    //한번 루프 후 first를 멈춘다.
    first@for(i in 1..5){
        second@for(j in 1..5){
            println("$i / $j")
            break@first  //continue@first도 가능
        }
    }


}
