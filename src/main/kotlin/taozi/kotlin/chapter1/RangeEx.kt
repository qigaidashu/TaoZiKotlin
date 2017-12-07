package taozi.kotlin.chapter1

import java.util.function.Consumer

var aIntRange:IntRange = 0..10//[0,10]
var bIntRange:IntRange = 0 until 10//[0,10)

fun main(args: Array<String>) {
    //ClosedRange是IntRange的父类,提供共有四个方法
    //start:起始位
    //endInclusive:最后一位
    //isEmpty:是否为空
    //contains:包含----> xxx in xxx
    println(aIntRange.start)
    println(aIntRange.endInclusive)
    println(bIntRange.endInclusive)
    println(aIntRange.isEmpty())
    println(aIntRange.contains(3))
    println(3 in aIntRange)
}
