package taozi.kotlin.chapter1

//Boolean类型
var aboolean: Boolean = true
var anthoerBoolean: Boolean = false

//Number类型
//1.Int类型(是Java中int和Integer的合体,kotlin会自动选择) 32位 4字节
var aInt: Int = 333
//var anthoerInt:Int = OxFF
var maxInt: Int = Int.MAX_VALUE
var mixInt: Int = Int.MIN_VALUE
//2.Long类型 64位 8字节
var aLong: Long = 3333333333333333
var anthoer: Long = 233L
//不可以隐式转换
var intToLong: Long = aInt.toLong()
var longToInt: Int = aLong.toInt()
var maxLong: Long = Long.MAX_VALUE
var minLong: Long = Long.MIN_VALUE

//3,short
var anShort: Short = 128

//4.float

//5.double


fun main(args: Array<String>) {
    println(maxInt)
    println(Math.pow(2.0, 31.0) - 1)
    println(mixInt)
    println(-Math.pow(2.0, 31.0))

}
