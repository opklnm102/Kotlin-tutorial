package DelegatedProperties

import kotlin.properties.Delegates

/**
 * Created by Dong on 2016-02-25.
 */

class User1{
    var name: String by Delegates.notNull()

    fun init(name: String){
        this.name = name
    }
}

fun main(args: Array<String>) {
    val user = User1()
    user.init("carl")
    println(user.name)
}