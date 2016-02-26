package DelegatedProperties

import kotlin.properties.Delegates

/**
 * Created by Dong on 2016-02-25.
 */

class User{
    var name: String  by Delegates.observable("no name"){
        d, old, new -> println("$d - $old - $new")
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "Carl"
    user.name = "zz"
}
