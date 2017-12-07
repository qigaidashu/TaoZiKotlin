package taozi.kotlin.chapter1

//char类型
var aChar:Char = '0'
var bChar:Char = '中'
//Unicode编码
var cChar: Char = '\u000f'
//转义字符
var dChar: Char = '\\'

fun main(args: Array<String>) {
    println(aChar)
    println(bChar)
    println(cChar)
    println(dChar)
}