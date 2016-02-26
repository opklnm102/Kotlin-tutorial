package grammar

import java.util.logging.Logger

/**
 * Created by Dong on 2016-02-26.
 */
/*
 * 클래스
 * 형식
 * class 클래스명 contructor(val 변수명: 자료형...)
 *
 * 클래스는 하나의 주생성자와 여러개의 보조 생성자를 가지는데
 * 주생성자는 클래스를 선언하며 함께 선언해준다.
 */

//고객 클래스 정의
class Customer constructor(val name: String, val phone: String)

//constructor키워드 생략 가능
class Customer2(val name: String, val phone: String)

//인스턴스 변수의 초기화는 생성자에서 받은 변수로 바로 해주면 된다.
class Customer3(val name: String, val phone: String) {
    val cName = name
    val cPhone = phone
}

//보조 생성자가 없는데 초기화 설정코드가 있을 경우엔 init블록을 사용하여 초기화
class Custoner4(val name: String, val phone: String) {
    val cName = name
    val cPhone = phone

    init {
        val cPhone = phone
    }
}

//보조 생성자 - 클래스의 코드블럭 안에서 constructor키워드를 이용해 선언
class Customer5(val name: String, val pheon: String) {
    val cName = name
    val cPhone = pheon

    constructor(name: String) : this(name, "zzz") {
        //초기화 코드
    }
}

/*
 * 오픈 클래스
 * 코틀린에서 모든 클래스는 기본적으로 final이기 때문에 상속되질 않는다.
 * 상속시키고 싶다면 open class로 선언해야 한다.
 * 클래스 내부에서도 오버라이딩을 허용할 메소드만 open으로 선언
 */
open class Person(open val name: String, open val phone: String) {
    val cName = name
    val cPhone = phone

    open fun write() {
        println("person $cName / $cPhone")
    }

    fun hello() {
        println("Hello")
    }
}

class Student(override val name: String, override val phone: String) : Person(name, phone) {

    //오버라이딩 - override 키워드 사용
    override fun write() {
        //code
        println("student")
    }
}

/*
 * 추상 클래스
 * 코틀린의 모든 클래스는 final이지만 open과 함께 추상클래스도 상속 가능
 * abstract클래스를 상속받은 클래스는 abstract메소드를 반드시 구현
 * abstract클래스와 open클래스는 다중 상속이 불가능
 */
abstract class Person2(val name: String, val phone: String){
    val cName = name
    val cPhone = phone
    abstract fun printInfo()
}

/*
 * 인터페이스
 * Java8과 같이 메소드의 구현이 가능
 * 인스턴스 변수 초기화X, 자식클래스에서 오버라이드하여 값 부여
 * 다중 상속 가능
 */
interface MyInterface{
    var prop: Int
    fun myFun()
    fun printProp(){
        println(prop)
    }
}

//인터페이스 구현
class Child: MyInterface{
    override var prop: Int
        get() = throw UnsupportedOperationException()
        set(value) {
        }

    override fun myFun() {
        throw UnsupportedOperationException()
    }

    override fun printProp(){
        println(prop)
    }
}

//다중 상속
interface MyInterface1{
    fun myFunc(){
        println("interface 1")
    }
}

interface MyInterface2{
    fun myFunc(){
        println("interface 2")
    }
}

class Child2: MyInterface1, MyInterface2{
    override fun myFunc(){
        //부모 메소드의 호출
        super<MyInterface1>.myFunc()  //MyInterface1
        super<MyInterface2>.myFunc()  //MyInterface2
    }
}

/*
 * 데이터 클래스(Data Transfer Object)
 * DTO를 코틀린에서는 쉽게 정의
 * getter를 제공하지만, setter를 제공하지는 않는다.
 * data class 클래스명(val 변수명: 자료형...)
 */
data class Student2(val name: String, val phone: String)

fun main(args: Array<String>) {
    val student = Student2(name="Dong", phone = "010-0000-0000")
    println("${student.name} / ${student.phone}")

    //setter를 제공하지 않아 값을 변경하려면 copy()를 통해 객체를 복사
    val modifiedStudent = student.copy(phone = "010-1111-1111")
    println("${modifiedStudent.name} / ${modifiedStudent.phone}")

    //데이터 클래스 인스턴스 값들은 변수에 한번에 집어 넣을 수 있다.
    val (name, phone) = modifiedStudent
    println("$name / $phone")
}











































