package day01

/**
 * 字符串模板
 * 字符串字面值可以包含模板表达式 ，即一些小段代码，
 * 会求值并把结果合并到字符串中。 模板表达式以美元符（$）开头，由一个简单的名字构成:
 */
class StringOutDemo {
}
        fun main(args : Array<String>){
            val i = 10
            println("i = $i")// 输出结果为: i=10 保留了i的值
            // 也可以把求值结果，要计算放于花括号中 花括号中的任意表达式
            val s = "abc";
            println("$s.length is ${s.length}");// 输出结果为abc.length is 3;

            // 如果需要$本身 不支持斜杠经行转义
            println("${'$'}i")
        }

