package taozi.kotlin.chapter2

//运算符
class Complex(var real: Double, var imaginary: Double) {
    //定义父类的基本操作符
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary);
    }
    //重载定义操作符
    operator fun plus(other: Int): Int {
        return real.toInt() + other
    }


    override fun toString(): String {
        return "$real + $imaginary"
    }
}

fun main(args: Array<String>) {
    var c1 = Complex(2.0, 3.0)
    var c2 = Complex(3.0, 4.0)
    println(c1 + c2)//使用自己定义的plus
    println(c1 + 5)
}