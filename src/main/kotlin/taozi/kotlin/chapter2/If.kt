package taozi.kotlin.chapter2

const val DEBUG = 1
const val USER = 2
fun main(args: Array<String>) {
    //if表达式,每个分支最后一句就是它的返回值
    val mode = if (args[1] == "1" && args.isNotEmpty()){
        DEBUG
    }else{
        USER
    }

    println(mode)
}