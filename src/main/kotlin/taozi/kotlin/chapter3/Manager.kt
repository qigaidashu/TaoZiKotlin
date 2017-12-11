package taozi.kotlin.chapter3

//by:代理两个对象做同样的事情,接收请求对象让另一对象去处理
class Manager(driver: Driver):Driver by driver{
//    override fun driver() {
//    }
}

class CartBus:Driver{
    override fun driver() {
        println("cartBus 开车")
    }
}
interface Driver{
    fun driver()
}

fun main(args: Array<String>) {
    val manager = Manager(CartBus())
    manager.driver()
}