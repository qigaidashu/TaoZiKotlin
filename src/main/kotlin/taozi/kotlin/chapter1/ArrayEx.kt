package taozi.kotlin.chapter1

val intArray: IntArray = intArrayOf(1, 2, 3, 4)
val charArray: CharArray = charArrayOf('h', 'e', 'l', 'l', 'o')
val stringArray: Array<String> = arrayOf("李蛋", "如花", "王麻子")
val objectArray:Array<Human> = arrayOf(Women("女", "如花"), Man("男", "李蛋"))

fun main(args: Array<String>) {
    //数组遍历
    for (int in intArray){
        println(int)
    }

    println(objectArray[0])
    //赋值
    objectArray[0] = Man("男", "尼玛")
    println(objectArray[0])

    //数组的连接objectArray.joinToString()
    println(objectArray.joinToString())
    //数组的切片
    println(intArray.slice(1..3))
}
