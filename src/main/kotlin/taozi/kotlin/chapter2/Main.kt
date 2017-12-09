package taozi.kotlin.chapter2

//val常量(final)
//加了const修饰val是编译期常量
const val FINAL_HELLO_WORLD: String = "finalhelloworld"
//var变量
var helloWorld: String = FINAL_HELLO_WORLD

//类型推导,不写类型,只关注类型可变不可变;
val FINAL_HELLO_CHINA = "HelloChina"

//函数   fun 函数名([参数列表]):[返回值]{函数体}
fun sum(aint: Int, bint: Int){
    println("${aint} + ${bint} = ${aint + bint}")
}

//匿名函数
val sum2 = fun(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

// fun 函数名([参数列表]) = 表达式
//返回的值是后面表达式
fun sum3(arg1: Int, arg2: Int): Int = arg1 + arg2

//lambda表达式
val sum4 = {arg1:Int,arg2:Int->arg1+arg2}

fun main(args: Array<String>) {
//    println(FINAL_HELLO_CHINA)

//    sum(1, 2)
//    println( sum2(2,3))
//    println(sum3(3, 3 ))
//    println(sum4(1,2))
    //使用标签退出lambda表达式
    args.forEach forEach@{
        if (args[args.indexOf("p")] == "p") {
            return@forEach
        }
        println(args)
    }


//    args.forEach(::println)
}