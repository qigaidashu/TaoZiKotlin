package taozi.kotlin.chapter3.enmus

//枚举类
enum class Weeks(val id:Int) {
    //每一个枚举常量都携带了name和ordinal(索引位置)属性
    MON(1),TUE(2),WED(3)
}

fun main(args: Array<String>) {
    //遍历枚举
    for (value in Weeks.values()){
        println("${value.ordinal} ${value.name}")
    }
    //遍历方式二
//    Weeks.values().map (::println)

    println(Weeks.valueOf("WED"))

}