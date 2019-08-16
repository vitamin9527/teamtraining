package i_introduction._10_Object_Expressions

import util.TODO
import util.doc10
import java.util.*
import kotlin.Comparator

fun todoTask10(): Nothing = TODO(
    """
        Task 10.
        Read about object expressions that play the same role in Kotlin as anonymous classes in Java.

        Add an object expression that provides a comparator to sort a list in a descending order using 'java.util.Collections' class.
        In Kotlin you use Kotlin library extensions instead of java.util.Collections,
        but this example is still a good demonstration of mixing Kotlin and Java code.
        解在Kotlin中扮演与Java中的匿名类相同角色的对象表达式。添加一个对象表达式，
        该对象表达式提供一个比较器，使用“java.util”按降序对列表排序。集合的类。
        在Kotlin中，您使用Kotlin库扩展而不是java.util.Collections，
        但是这个例子仍然很好地展示了Kotlin和Java代码的混合。
    """,
    documentation = doc10()
)

fun task10(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList,object  : Comparator<Int>{
        override fun compare(o1: Int, o2: Int) = o2 - o1
    })
    return arrayList
}