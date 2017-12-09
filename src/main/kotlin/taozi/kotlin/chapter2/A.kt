package taozi.kotlin.chapter2

class Teacher(var name:String){
    var tname = name
    //方法
    fun teach(){
        println("teach")
    }

    override fun toString(): String {
        return tname
    }
}

class Student{
    //属性
    var id = 1
    //var用lateinit延迟初始化
    lateinit var name:String
    lateinit var teacher:Teacher
    val gender by lazy {
        println("init start")
        "男"
    }

}

fun main(args: Array<String>) {
    val student = Student()
    student.name = "taozi"
    student.teacher = Teacher("李老师")
    student.teacher.teach()

    println(student.id)
    println(student.name)
    println(student.teacher)
    println(student.gender)
}