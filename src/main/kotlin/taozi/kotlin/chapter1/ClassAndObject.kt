package taozi.kotlin.chapter1
//
//class 妹子(长相: String, 身高: String) {
//    init {
//        println("new 一个妹子,长相:$长相, 身高:$身高")
//    }
//}
//
//class 帅哥(长相: String, 身高: String) {
//    init {
//        println("new 一个帅哥,长相:$长相, 身高:$身高")
//    }
//}

open class Human(var gender: String, var name: String){
    init {
        println("new 一个${this.javaClass.simpleName}, gender:$gender, name:$name")
    }

    override fun toString(): String {
        return "${gender} ==== ${name}"
    }
}

class Women(gender: String, name: String): Human( gender, name)
class Man(gender: String, name: String): Human( gender, name)

fun main(args: Array<String>) {
    var wangMaZi:Women  = Women("女", "王麻子")
    var liDan:  Man= Man("男", "李蛋")
}