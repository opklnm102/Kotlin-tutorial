package DelegatedProperties

/**
 * Created by Dong on 2016-02-25.
 */

class User2(val map: Map<String, Any?>){
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    val user = User2(mapOf("name" to "John Doe", "age" to 25))

    println("name = ${user.name}, age = ${user.age}")
}
