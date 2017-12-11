package taozi.kotlin.chapter3.enmus

sealed class Opration{
    class Add(val a:Int, val b:Int):Opration()
    class Substract(val a:Int, val b:Int):Opration()
    class Multiply(val a:Int, val b:Int):Opration()
    class Divide(val a:Int, val b:Int):Opration()
}

fun action(op: Opration): Unit {
    when(op){
        is Opration.Add-> println("${op.a} + ${op.b} = ${op.a + op.b}")
        is Opration.Substract-> println("${op.a} - ${op.b} = ${op.a - op.b}")
        is Opration.Multiply-> println("${op.a} * ${op.b} = ${op.a * op.b}")
        is Opration.Divide-> println("${op.a} / ${op.b} = ${op.a / op.b}")
    }
}

fun main(args: Array<String>) {
    action(Opration.Divide(5,2))
}