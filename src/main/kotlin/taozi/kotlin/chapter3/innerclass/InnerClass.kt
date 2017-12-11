package taozi.kotlin.chapter3.innerclass

class OutClass {
    val a = 3

    //默认的是静态内部类,不能访问外部类的成员
    //内部类要加 inner
    inner class InnerClass{
        val a = 0
        //内外属性名一样用this@OutClass.a区分
        fun hello() = println("内部类访问外部成员${this@OutClass.a}")
    }
}

fun main(args: Array<String>) {
    //静态内部类可以直接创建
//    val sInner = OutClass.InnerClass()
    //内部类需要外部类对象去创建
    val inner = OutClass().InnerClass()
    inner.hello()
}