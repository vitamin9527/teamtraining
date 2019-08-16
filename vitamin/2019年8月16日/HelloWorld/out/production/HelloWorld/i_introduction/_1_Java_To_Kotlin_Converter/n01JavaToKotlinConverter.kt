package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

fun todoTask1(collection: Collection<Int>): Nothing = TODO(
    """
        Task 1.
        Convert the Java method 'task1' of the class 'JavaCode1' into Kotlin.
        In IntelliJ IDEA or Android Studio, you can copy the Java code,
        paste it into the Kotlin file and let IDE convert it.
        Please use automatic conversion for this task only.
    """,
    references = { JavaCode1().task1(collection) })


fun task1(collection: Collection<Int>): String {// 修改java代码 用kotiln表现
    val sb = StringBuilder();// val建立可变字符串
    sb.append("{");// 增加左括号
    val iterator = collection.iterator();// val定义迭代器
    while (iterator.hasNext()) {// 循环
        val element = iterator.next(); // 赋值
        sb.append(element);// 增加集合中的元素
        if (iterator.hasNext()) {// 如果还有下一个
            sb.append(", ");// 添加一个 ，分割
        }
    }
    sb.append("}");// 增加左括号
    return sb.toString();// 转为字符串输出
}