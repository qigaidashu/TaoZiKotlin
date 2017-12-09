package taozi.kotlin.chapter2

fun main(args: Array<String>) {
    val x = 1
    //when加强版的switch可以接收任意类型
    when (x) {
        is Int -> println("$x is int")
        in 0..10 -> println("$x in 0..10")
        else -> println("not")
    }

    val mode = when {
        args.isNotEmpty() && args[0] == "1" -> "taozi"
        else -> {
            "hehe"
        }
    }

}