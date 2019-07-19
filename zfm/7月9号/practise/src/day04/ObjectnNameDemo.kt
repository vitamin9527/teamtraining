package day04

/**
 * 对象声明及其相关
 * 语法格式：object objictName : 0-N个父类
 */
class ObjectnNameDemo {
}
interface Outputavle{
    fun output(msg: String)
}
abstract  class Product(var price: Double){
    abstract val name: String // 定义属性
    abstract  fun printInfo()// 定义方法
}
// 指定一个父类型（接口）的对象表达式
object MyObject: Outputable{
    override fun output(msg: String) {
        for (i in 1..6){
            println("<h${i}>${msg}</h${i}>")
        }
    }
}
// 指定0个父类型的对象表达式
object MyObject2{
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
    class Foo// 只能包含嵌套类 不能包含内部类
}
// 定义两个父类型的对象表达式
// 因为Product 只有一个带参数的构造器 因此需要传入构造器参数
object MyObject3: Outputable, Product(23.3) {
    override fun output(msg: String) {
        println("输出信息："+msg)
    }

    override fun printInfo() {
        println("高速激光打印机 支持高速打印")
    }
    override val name: String
        get() = "激光打印机"

}

fun main(args: Array<String>) {
    MyObject.output("疯狂教育中心")
    println("---------")
    println(MyObject2.name)
    MyObject2.test()
    println("-------")
    println(MyObject3.name)
    MyObject3.output("kotiln真不错")
    MyObject3.printInfo()
}
