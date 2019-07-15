package Day01

class MainDemo {
}
    /**
     * 定义函数
     */
//        companion object {//主函数的定义 放于class内 因为在java中时static的主函数 即放于类内部时需要也放于静态中
//        @JvmStatic
//        fun main(args: Array<String>){
//            var result = sum(5,6)// 调用函数sum 并接收输出
//            print(result);
//        }
//        }
    fun main(args: Array<String>){// 主函数的定义 放于class外
        var result = sum1(6,7)// 调用函数sum1 并接收输出
        print(result)
        printlnSum(7,7)// 调用函数 printlnSum
        printlnSum1(8,8)// 调用函数 printlnSum1
    }

    fun sum(a: Int, b: Int):Int {// 一个简单函数 定义 计算a+b的值（带参 返回Int的函数）
        return a + b
    }

    fun sum1(a: Int, b:Int) = a+b// 将表达式作为函数体 返回值类型自行推断的函数

    fun printlnSum(a: Int, b :Int):Unit {// 函数返回无意义的值
        print("sum $a and $b is ${a+b}")
    }

    fun printlnSum1(a: Int, b: Int){// Unit 返回值类型可以省略
        print("sum $a and $b is sum= ${a+b}")
    }
