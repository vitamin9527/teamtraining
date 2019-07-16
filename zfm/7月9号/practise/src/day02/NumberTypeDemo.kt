package day02

/**
 * 数据类型 及其转换
 */
class NumberTypeDemo {
}

fun main(args : Array<String>) {
     // 1.声明变量（var 是可修改变量 val是只读的 不可经行修改）
    // 声明变量是显式指定类型
    var b : Int
    // 声明变量时指定初始值，编译器会根据初始值确定该变量的类型为String
    var name = "caras.org"
    b = 20 // b的类型时整型（Int），赋值正确
    name = "fkrl.okl" // name的类型为String 赋值正确
    // 声明变量时既显式指定类型，也指定初始值，当显式指定的初始值的类型与指定类型一致时 变量声明正确
    var age : Int = 25;
    val book = "疯狂"
    //book = "d"// 错误 val是只读 只赋值一次 不可更改

    // 2.整型(包装类)
    // 因为Int类型不支持null值 所以下面代码是错误的
    // var notNull : Int = null
    // Int? 相当于支持null的Int型，所以下面代码是正确的
    var nullanble : Int? = null// 其他数据类型的包装类似 Byte？ Short? Int? Long?
    // 以0b开头或 0B开头的整数数值是二进制的整数
    var binValue1 = 0b1010101
    var binValue2 = 0B10101010
    // 以0x或者0X开头是16进制的整数
    var hexValue1 = 0x13
    var hexValue2 = 0Xaf
    println("binValue2的值是：${binValue2}")// 170
    println("binValue1的值是：${binValue1}")// 85
    println("hexValue2的值是：${hexValue2}")// 175
    println("hexValue1的值是：${hexValue1}")// 19

    // 3.浮点型
    // 在没没声明数组类型的情况下 默认是double
    var af1 = 5.234556f
    println("af1的值为：${af1}")
    // 声明af2是Float，但是25.2345默认为Double类型，因此下列代码编译时报错
    //var af2 : Float = 25.2345

    // 4.字符型
    // 需要注意的是 char型变量不能当成整数值使用，char型变量或表达式不能复制给整型变量 整型变量也不能赋值给char型变量
    // 直接指定单个字符作为字字符值
    val aChar : Char = 'a'
    // 使用转义字符来作为字符值
    val enterChar: Char = '\r'
    // 使用Unicode编码来指定字符值
    val ch :Char = '\u9999'
    // 输出一个”香"字
    println(ch)
    // 定义一个“疯”字符值
    var zhong :Char = '疯'
    // 将Char型变量当成Int处理会报错
    //var zhongValue :Int = zhong

    // 5.字符串类型
    var str = "fkjava.org"
    // 允许通过是str[i]的格式访问指定索引的元素
    print(str[2]) // 输出“j”
    print(str[3])// 输出“a”
    //也可以遍历直接输出字符串的每一个字符
    for (s in str){
        println(s)
    }
    // 原始字符串：原始字符串可以包含换行和任意文本，原始字符串需要用3个引号引起来
    // 定义普通字符串
    var str1 = "fkjava.org"
    println(str.length)
    // 定义原始字符串
    val txt = """
        |天上白玉京，
        |十二楼五城，
        |仙人抚我顶，
        |结发爱长生。
    """.trimIndent()// trimIndent（）方法用来去掉原始字符串前面的缩进
    println(txt)



    // 6.数据型之间的转换
    // 整型之间的转换
    /*
    toByte():转换为Byte类型
    toShort():转换为Short类型
    toInt():转换为Int类型
    toLong():转换为Long类型
    toFloat():转换为Float类型
    toDouble():转换为Double类型
    toChar():转换为Char类型
    不同整型的变量值必须经行显式转换
    当转换时 需要考虑数值的溢出问题
     */

}