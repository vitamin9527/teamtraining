package day01

/**
 * 关于lambda函数的
 * 表达式的本质其实是匿名函数，因为在其底层实现中还是通过匿名函数来实现的。但是我们在用的时候不必关心起底层实现。
 * 不过Lambda的出现确实是减少了代码量的编写，同时也是代码变得更加简洁明了。
 * lambda 表达式总数被大括号括着
 * 其参数（如果存在）在 -> 之前声明（参数类型可以省略）
 * 函数体（如果存在）在 -> 后面
 */
class LambdaDemo {
}
        fun main(args: Array<String> ){
            // 无参数的情况
            val test = { print("无参数")}
            test()// 输出结果为：“无参数”

            // 有参数的情况 两种格式
            // 1.val/var 变量名 : (参数的类型，参数类型，...) -> 返回值类型 = {参数1，参数2，... -> 操作参数的代码 }
            // 2.val/var 变量名 = { 参数1 ： 类型，参数2 : 类型, ... -> 操作参数的代码 }
            //val test1 : (Int , Int) -> Int = {a , b -> a + b}
            val test1 = {a : Int, b : Int -> a+b} // 表达式的返回值类型会根据代码自行推断出来 他与上面的写法是一致的
            test1(5,6);

            // 当lambda 表达式作为函数中的参数的时候
            // 格式：fun test(a : Int, 参数名 : (参数1 ： 类型，参数2 : 类型, ... ) -> 表达式返回类型){ ...}
            fun test2(a : Int, b : (num1 : Int, num2 :Int) ->  Int): Int{
                return a + b.invoke(3,5)
            }
            // 调用该方法
            test2(10,{num1 : Int,num2 : Int -> num1 + num2})
        }




