package day02

/**
 * 数组相关
 */
class ArrayDemo {
}

fun main(args : Array<String>) {
    // 创建数组
    // 创建包含指定元素的数组（相当于java数组的静态初始化）
    var arr1 = arrayOf("java","kotlin","swift","go")
    var intArr1 = arrayOf(2,4,500,-34)

    // 创建指定长度。元素为null的数组（相当java数组的动态初始化）
    var arr2 = arrayOfNulls<Double>(5)//长度为5 的Double类型数组
    var intArr2 = arrayOfNulls<Int>(6)// 长度为6的Int类型的数组

    // 创建长度为0的空数组
    var arr3 = emptyArray<String>()// 长度为0的String类型的数组
    var intArr3 = emptyArray<Int>()// 创建长度为0的Int类型的数组

    // 创建指定长度 使用Lambda表达式初始化的数组
    var arr4 = Array(5,{(it * 2 + 97).toChar()})

    // 数组元素的访问以及访问
    var strArr = arrayOf("kotlin","java","swift")
    // 使用两种元素获取数组元素
    println(strArr[1])// 输出为java
    println(strArr.get(1))// 数组为 java

    // 两种方式修改数组元素
    strArr[0] = "c++"
    strArr.set(1,"c#")
    println(java.util.Arrays.toString(strArr))// 数组结果为["c++","c#","swift"]

    // 获取数组的长度
    val size = strArr.size
    println(size) // 数组结果为3

    // 使用for循环遍历数组
    var books = arrayOf("语文","数学","英语")
    for (book in books){// 注：用for -in循环遍历数组元素或者集合元素时，不允许对循环变量进行赋值
        println(book)// 数组结果 语文 数学 英语
    }

    // 数组的常用方法
    // 先定义一个数组
    var arr = arrayOf(2,4,5,6)
    //判断是否所有元素的平方都大于20
    println(arr.all({it * it > 20}))// 返回的是boolean值 返回false
    // 判断是否任一元素的平方大于20
    println(arr.any({it * it > 20}))// 输出true
    // 计算数组所有元素的总和
    println(arr.fold(0, {acc, e -> acc+e}))// 输出17

    // 定义一个数组
    var a = arrayOf(3,4,5,6)
    // 定义一个a2数组
    var a2 = arrayOf(3,4,5,6)
    // 比较两个数组是否相等
    println("a数组和a2数组是否相等：${a.contentEquals(a2)}")// 输出为true
    // 复制 a数组，生成一个新的b数组
    var b = a.copyOf(6)
    println("a数组和b数组是否相等：${a.contentEquals(b)}")// 输出false 应为复制的时候长度不一
    // 输出b数组的元素，将输出【3，4，5，6，null，null】
    println("b数组的元素为：${b.contentToString()}")// ，将输出【3，4，5，6，null，null】 将数组转为strng
    // 将数组的第五个（包括）到第6个元素赋值为1
    b.fill(1,4,6)
    // 输出b
    println("b数组的元素为：${b.contentToString()}")// 输出为【3，4，5，6，1，1】
    // 对b经行排序
    b.sort();
    // 输出b数组
    println("排序后的b数组为：${b.contentToString()}")// 输出为[1, 1, 3, 4, 5, 6]


}