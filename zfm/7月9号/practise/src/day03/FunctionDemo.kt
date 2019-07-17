package day03

/**
 * 函数相关
 */
class FunctionDemo {
}

fun main(args : Array<String>) {
   /*
   1.语法格式
   fun 函数名（形参列表）：返回值类型{
          由零条到多条的可执行语句组成的函数
   }
   函数名： 合法的标识符 符合编写规范
   形参列表 ：格式;名称：类型 ，可以为多个函数 用“，”隔开
   返回值类型：是所允许的任何数据类型， 如果不需要返回值类型，可以省略返回值部分 或者”：Unit“指定Unit代表没有返回值类型
    */

    // 2.递归函数（在一个函数内调用他自身，被称为递归 隐式的循环 ）
    // 例：有一个数列：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),其中n是大于0的整数，求f（10）的值 也是：f（n）=2*f(n-1)+f(n-2)
    fun fn(n : Int):Int{
        if(n == 0){
            return 1;
        }else if (n == 1){
            return 4
        }else{
            return 2 * fn(n-1) + fn(n-2)// 再次调用自身方法 形成循环
        }
    }
    println("fn(10)的值是：${fn(10)}")

    /*
    3.单表达式函数 当返回的只是单个表达式时，此时可以省略花括号并在等号后指定函数体即可
     */
    fun area(x: Double, y: Double): Double = x * y;
    println(area(2.5,66.3))

    // 4.形参默认值
    // 打印三角形，只为第一个参数指定默认值
    fun printTrinage(height: Int = 5, char: Char){
        for(i in 1..height){
            // 先打印一排空格
            for (j in 0 until height - i){
                print(" ")
            }
            // 在打印一行特殊字符
            for (j in 0 until 2 * i -1){
                print(char)
            }
            println()
        }
    }
    // 调用执行方法
    printTrinage(6, '@')// 位置参数
    printTrinage(7,char = '#') // 位置参数加命名参数
    printTrinage(char = '*')// height用默认 char用命名

    /*
    5.尾递归函数
    当调用自身作为最后一行代码 且递归调用之后没用更多代码 就可将其改为尾递归函数 相比于普通递归，可以减少对内存的消耗
     */
    // 例如
    fun fact(n: Int): Int{
        if (n == 1){
            return 1
        }else{
            return n * fact(n-1)
        }
    }
    // 符合尾递归函数 修改为(需要tailrec修饰)
    tailrec fun factRec(n: Int, total: Int): Int = if(n == 1) total else factRec(n-1, total * n)

    // 6.个数可变的形参 ，如果在定义函数时，在形参的类型前添加vararg修饰 则表明给形参可以接受多个参数值
    fun test(a: Int,vararg books: String){// 要求一个函数只能带一个个数可变的形参 如果第一个形参是可变的，那么要求后面的参数赋值时要采用命名参数赋值
        // books被当作数组处理
        for (book in books) {
            print(book)
        }
    }
    test(5, "dsd","dsad")

    /*
    7. 函数的重载
    重载：如果程序中包含两个及两个以上函数名相同，但形参列表不同的函数 这就称为函数重载
    （仅有形参名不同。返回值类型不同或修饰符不同 则不能算函数重载）
     */
    fun test1(){
        println("这是无参函数")
    }
    fun test1(a: Int){
        println("这是带一个参的函数")
    }
    fun test1(a: String){
        println("这是另一个类型")
    }
    // 注意：当重载的时可变形参时 只有当为一个参数时才会精准匹配 ，其他多个参数都是匹配可形参 但是不建议去重载可变形参 因为没有意义且任意出错

    /*
    8.使用函数类型作为形参类型
     */
    fun map(data: Array<Int>, fn: (Int) -> Int): Array<Int>{
        var result = Array<Int>(data.size, {0})
       for (i in data.indices){
           result[i] = fn(data[i])
       }
        return result;
    }
    // 定义一个计算平方的函数
    fun square(n: Int): Int{
        return n * n
    }
    // 定义一个计算立方的函数
    fun cube (n: Int): Int{
        return n * n * n
    }
    var data = arrayOf(2,6,4,3,6,4)
    println(map(data, ::square).contentToString())

}