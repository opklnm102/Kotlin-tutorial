package grammar  //패키지 선언

/**
 * Created by Dong on 2016-02-26.
 */

import LongerExample.*  //패키지 불러오기

//as키워드로 클래스에 다른 이름을 붙여줄 수 있다.
import java.util.Random as MyRandom

fun main(args: Array<String>) {
    var random:MyRandom = MyRandom()
    println(random.nextInt())

    var random2 = java.util.Random()
    println(random2.nextInt())
}
