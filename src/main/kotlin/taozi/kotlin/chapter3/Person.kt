package taozi.kotlin.chapter3

abstract class Person(open val name: String) {
    //父类中abstract方法,父类不知道具体的实现,需要交给子类去具体实现.
    ///包含的abstract方法那么这个类也要变成abstract类
    abstract fun work()

    //不是abstract方法,可以让子类复写,要open
    open fun eat() {

    }
}

//继承和接口:默认的类和方法都final的,如要继承或实现它要open它,复写方法(属性)要override
class Student(override val name: String) : Person(name) {
    override fun work() {
        println("我是${name}学生")
    }

    override fun eat() {
        super.eat()
    }
}

class Teacher : Person {
    //复写父类属性
    override val name: String

    constructor(name: String) : super(name) {
        this.name = name
    }

    override fun work() {
        println("我是${name}老师")

    }

}

fun main(args: Array<String>) {
    val person:Person = Student("李蛋")
    val person2:Person = Teacher("王")
    person.work()
    person2.work()
}

