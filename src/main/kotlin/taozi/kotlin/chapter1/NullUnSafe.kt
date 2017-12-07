package taozi.kotlin.chapter1

//空类型
fun getName(): String? {
    return null
}

fun main(args: Array<String>) {
    //?对前面判断如果返回null就return
//    val name:String = getName()?:return
//    println(name.length)

    //value是可null,但是值却不为null
    val value:String? = "hello"
    println(value?.length)//正确
//    println(value!!.length)//正确

    var ruHua: Human = Women("女", "如花")
    if (ruHua is Women)
        ruHua

//    val parent:Human = ruHua as Human
//    if (parent is Human){
//        parent
//    }
}