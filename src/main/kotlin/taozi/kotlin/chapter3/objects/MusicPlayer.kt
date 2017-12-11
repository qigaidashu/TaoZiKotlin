package taozi.kotlin.chapter3.objects

class Driver

abstract class Player

interface OnExternalMountListener{
    fun onMount(driver: Driver)
    fun unMount(driver: Driver)
}

//object只有一个实例的类(基础的单例),可以继承类和实现接口
object MusicPlayer:Player(),OnExternalMountListener{
    //可以有属性
    val i = 0

    override fun onMount(driver: Driver) {
    }

    override fun unMount(driver: Driver) {
    }

}

fun main(args: Array<String>) {
    val m1 = MusicPlayer
    val m2 = MusicPlayer

    //同一个对象
    println(m1)//taozi.kotlin.chapter3.objects.MusicPlayer@5cad8086
    println(m2)//taozi.kotlin.chapter3.objects.MusicPlayer@5cad8086
}