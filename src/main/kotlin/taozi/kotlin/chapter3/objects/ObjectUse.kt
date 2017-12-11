package taozi.kotlin.chapter3.objects

interface OnClickListener{
    fun onClick()
}

open class Button{
    fun setOnClickListener(listener: OnClickListener) {
        listener.onClick()
    }
}

open class Animal(var name:String){
    open fun eat(){
        println("动物吃东西")
    }
}

fun main(args: Array<String>) {

    val button = Button()
    //1. kotlin中没有匿名内部类,可以使用object来完成
    button.setOnClickListener(object :OnClickListener{
        override fun onClick() {
            //dosomething
        }
    })

    //2. object继承一个类
    //dog作为Animal的子类
    val dog = object :Animal("狗狗"){
        override fun eat() {
            println("$name 吃东西")
        }
    }
    dog.eat()//狗狗 吃东西

    //3.object既不实现接口,也不继承类
    //person作为一个匿名类
    val person = object {
        val name = "李蛋"
        val age = 19
    }
    println(person.name)//李蛋
    println(person.age)//19
}