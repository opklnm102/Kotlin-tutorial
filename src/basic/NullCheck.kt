package basic

/**
 *
 * Created by Dong on 2016-02-25.
 */

fun parseInt(str: String): Int?{
    try{
        return Integer.parseInt(str)
    }catch(e: NumberFormatException){
        println("One of the arguments isn't Int")
    }
    return null
}

fun main(args: Array<String>) {
//   if(args.size < 2){
//        println("No Number")
//    } else{
       val x = parseInt("10")
       val y = parseInt("20")

       if(x != null && y != null){
           println(x * y)
       }else{
           println("One of the arg is null")
//       }
   }
}
