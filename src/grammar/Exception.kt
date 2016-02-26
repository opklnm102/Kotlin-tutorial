package grammar

/**
 * Created by Dong on 2016-02-26.
 */

/*
 * try-catch - Java와 동일
 */
fun main(args: Array<String>) {

    try{
        //Code Block
    }catch(e: Exception){
        //예외시 동작
    }finally{
        //finally 동작
    }

    //변수에도 적용 가능
    //result에는 cases()에서 예외 발생시 -1이 들어간다.
    var result = try{
        cases(2)
    }catch(e: Exception){
        -1
    }

    /*
     * try-with-resource - Java7에서 추가된것을 사용 가능
     */
    var stream =
            java.nio.file.Files.newInputStream(java.nio.file.Paths.get("D:\\test.txt"))

    //Auto Close
    stream.buffered().reader().use { reader -> println(reader.readText()) }
}