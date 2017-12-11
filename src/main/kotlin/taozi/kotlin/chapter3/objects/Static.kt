package taozi.kotlin.chapter3.objects

fun main(args: Array<String>) {
//    //minOf是个包级函数他不存在一个类中. Java中很多static方法都可以用包级函数
    //比如:Math中的static方法都不以自身相关,弄成一个Math类又不能实例化
    //public static Integer valueOf(String s)Integer的valueOf以自身相关,作为类static方法OK
//    val min = minOf(args[0].toInt(), args[1].toInt())

    val latitude1 = Latitude.ofDouble(3.0)
    val latitude2 = Latitude.ofLatitude(4.0)
}

//kotlin怎么实现类静态方法
class Latitude private constructor(val double: Double){

    //companion object这个类的伴生对象,也就是说我们定义一个Latitude它同时会定义一个object,
    //这个object只有一个实例
    companion object {
        val i by lazy {  }
        @JvmField
        val TAG:String = "latitude"

        @JvmStatic
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }

        fun ofLatitude(double: Double):Latitude{
            return Latitude(double)
        }
    }
}