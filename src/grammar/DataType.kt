package grammar

/**
 * Created by Dong on 2016-02-26.
 */
/*
 *  자료형
 */
fun main(args: Array<String>) {

    //정수
    val n1:Long  //64
    val n2:Int  //32
    val n3:Short  //16
    val n4:Byte  //8

    //실수
    val f1:Double  //64
    val f2:Float  //32

    //문자
    val c1:Char

    //논리
    val b1:Boolean

    /*
     * 타입 캐스팅
     * 형식: to자료형()
     */
    var num = 3
    val shortNum: Short = num.toShort()
    val longNum: Long = num.toLong()
    val strNum: String = num.toString()
    num = strNum.toInt() + 5

    /*
     * 래퍼런스 자료형
     * null값을 가질 수 있다.
     * 기본 타입 변수에 ?를 붙인다.
     */
    val a:Int? = 3  //java.lang.Integer과 같다.
}
