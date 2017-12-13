package taozi.kotlin.chapter4

class Hello{
    fun world():String{
        return "helloworld"
    }
}

fun Int.isOdd():Boolean = this % 2 == 0

fun main(args: Array<String>) {
    //world的函数引用
    val kFunction1 = Hello::world//(Hello)->String
    val hello = Hello()
    val kFunction0 = hello::world//String
    println(hello::world)
//    args.forEach (kFunction0)//(T)->unit
//    val kFunction11 = Int::isOdd//(Int)->Boolean
    val ints = intArrayOf(1, 2, 3, 4)
    println(ints.filter(Int::isOdd))
    println(kFunction1)
}