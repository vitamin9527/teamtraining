package day04

/**
 * kootiln的this及相关
 *
 */
class ThisDamo {
}
class A{// 隐式标签@A
    inner class B{// 隐式标签 @B（内部类 用inner修饰）
        // 为Int扩展 foo（）方法
    fun Int.foo() {
    var a = this@A// A的this
    var b = this@B // B的this
    var c = this // 不带标签的this，默认代表该方法所属对象：Int对象
    var c1 = this@foo// 显式指定foo对象 与c指定的对象相同
    println(a)
    println(b)
    println(c)
    println(c1)
    // 为String 添加扩展方法
    val funLit = lambda@ fun  String.(){
        var d = this // 不带标签的属性 默认代表该方法所属对象 ：String对象
        var d1 = this@lambda// 显示指定lambda表达式 与d相同
        println(d)
        println(d1)
    }
    "fkit".funLit()
    // 定义一个lambda表达式，没有接收者
    val funLit2 = {
        // 该this所在的lambda表达式没有接收者 因此当前范围没有this
        // 系统会继续向该lambda表达式所在范围搜索 this
        // 所以此处的this将会代表foo（）方法的接收者： Int对象
        val e = this
        val e1 = this@foo// 显式指定@foo标签 与 e代表的对象相同
        println("foo（）方法中lambda的this："+e)
        println(e1)
    }
    funLit2()
}
    fun testB(){
        // 调用2（Int）的foo（）方法
        2.foo()
    }
    }
    fun testA(){
        var bobj = B()
        println("程序创建的B对象：${bobj}")
        bobj.testB()
    }
}

fun main(args: Array<String>) {
    var aObj = A()// 创建A对象
    println("程序创建的A对象：${aObj}")
    aObj.testA()// 调用test方法

}