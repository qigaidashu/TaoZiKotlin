package taozi.kotlin.chapter2

//vararg变长参数,可以任意位置,跟数组一样
fun hello(double: Double, vararg int: Int, name: String = "taozi") {
    println(double)
    int.forEach(::println)
    println(name)
}

fun main(args: Array<String>) {
//    hello(3.0, 4, 5, name = "taozi")
    val array = intArrayOf(1, 3, 5, 5)
//    val list = listOf<Int>(1,3,5)
    hello(3.0, *array)

}