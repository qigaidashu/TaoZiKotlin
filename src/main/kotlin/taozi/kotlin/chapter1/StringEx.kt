package taozi.kotlin.chapter1

//7.String
var aString:String = "Hello"
//字符数组转换成string
var formChars:String = String(charArrayOf('H','e','l','l','o'))

fun main(args: Array<String>) {
    //==比较内容与Java的equals等价
    println(aString == formChars)
    //===比较的是对象的引用值
    println(aString === formChars)

    var aInt:Int = 1
    var bInt:Int = 2
    //Java相加
    println("" + aInt + " + " + bInt + " = " + (aInt + bInt) )
    //kotlin字符串模板
    println("$aInt + $bInt = ${aInt + bInt}")

    //Hello"Kotlin" 转义字符
    var sayHello: String = "Hello\"Kotlin\""
    println(sayHello)

    // 原始字符串用"""包含
    //但是字符串模板仍然可以使用,要输出$加个空格
    var rawString:String = """
        \t
        \n

        \$sayHello
        \$ sayHello
        """
    println(rawString)
    println(rawString.length)
}