 package day04

import java.awt.SecondaryLoop

/**
 *扩展方法。
 */
class ExtensionFunDemo {
}
// 定义一个Base类
open class Base ;
// 定义一个 Sub继承于base类
class Sub : Base();
// 添加 Base的扩展方法
fun Base.foo(){
    println("base的扩展方法")
}
// 添加sub的扩展方法
fun Sub.foo(){
    println("sub的扩展方法")
}

// 定义一个函数，传入Base类型的参数
fun invokeFoo(b : Base){
    b.foo()
}

// 扩展属性
class User(var first: String, var second: String){}
// 给user添加扩展属性
var User.fullName: String// 在添加扩展函数后 一定要重写get set方法（只读  get） 读写（get set ）
get() = "${first}.${second}"
set(value){
    println("执行扩展属性fullName的setter方法")
    // 要求 value中不允许有“.”
    if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")){
        println("你输入的fullName不合法")
    }else{
        var token = value.split(".")
        first = token[0]
        second = token[1]
    }
}


// 执行函数
fun main(args : Array<String>) {
    // 测试扩展方法
    invokeFoo(Sub())// 调用方法 传入的是Sub的参数
    // 输出结果  ”base的扩展方法“
    // 当继承之后重写父类的方法 调用的方法就是字类的方法
    // 而在扩展函数中，因为函数 invokeFoo默认传入的是Base参数 所以使用传入的函数

    // 测试扩展属性
    var user = User("悟空","老铁")// 创建User对象
    user.fullName = "孙悟饭.lpg"// 调用扩展属性 set
    println(user.first)// get ”孙悟饭“
    println(user.second)// 输出结果”1pg“
}

