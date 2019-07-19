package day04

/**
 * 对象表达式 以及对象声明
 * 语法格式：object： 0-N个父类型
 */
class ObjectDemo {
}

// 对象表达式
interface Outputable{// 定义一个接口 包含一个方法
    fun output(msg:String)
}
abstract class Productk(var price: Double){// 定义一个抽象类
    abstract val name: String // 定义属性
    abstract  fun printInfo()// 定义方法
}

fun main(arg: Array<String>) {
    // 指定一个父类型（接口）的表达式对象
    var ob1 = object : Outputable{
        override fun output(msg: String) {
            for (i in 1..6){
                println("<h${i}>${msg}</h${i}>")
            }
        }
    }
    ob1.output("疯狂教育")
    println("----------------")
    // 指定0个父类型的对象表达式
    var ob2 = object {
        // 初始化块
        init {
         println("初始化块")
        }
        // 属性
        var name = "kotlin"
        // 方法
        fun test (){
            println("test方法")
        }
        inner class Foo// 只能包含内部类 不能包含嵌套类
    }
    println(ob2.name)
    ob2.test()
    println("--------")
    // 定义两个父类型的对象表达式
    // 因为Product 只有一个带参数的构造器 因此需要传入构造器参数
    var obj3 = object : Outputable, Productk(23.3) {
        override fun output(msg: String) {
            println("输出信息："+msg)
        }

        override fun printInfo() {
            println("高速激光打印机 支持高速打印")
        }
        override val name: String
            get() = "激光打印机"
    }
    println(obj3.name)
    obj3.output("kotlin真不错")
    obj3.printInfo()
}

