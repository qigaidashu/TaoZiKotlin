package taozi.kotlin.chapter3.dataclass

import taozi.kotlin.chapter3.annotations.PoKo

//data class在编译时会自动生成toString,hashCode,equals,copy,componentX(解析对象包含的变量)
//如果你的类被PoKo标注了话,这个类在编译的时把final去掉,同时生成默认的无参构造方法
@PoKo
data class Country(val id:Int, val name:String)

fun main(args: Array<String>) {
    val china = Country(0,"中国")
    val usa = Country(1,"美国")

    //已经重写了toString
    println(china)//Country(id=0, name=中国)
    println(usa)//Country(id=1, name=美国)
    //componentX(解析对象包含的变量)
    println(china.component1())//0
    println(china.component2())//中国

    /*
    INVOKEVIRTUAL taozi/kotlin/chapter3/dataclass/Country.component1 ()I
    INVOKEVIRTUAL taozi/kotlin/chapter3/dataclass/Country.component2 ()Ljava/lang/String;
     */
    //(参数)=delegate, 参数值是对应delegate的componentX值
    val (id, name) = china
    println(id)
    println(name)
//    for ((index, value) in args.withIndex())

}