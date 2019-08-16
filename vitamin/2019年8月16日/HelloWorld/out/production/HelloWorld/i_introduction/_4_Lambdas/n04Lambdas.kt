package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'JavaCode4.task4()' in Kotlin using lambdas:
        return true if the collection contains an even number.
        You can find the appropriate function to call on 'Collection' by using code completion.
        Don't use the class 'Iterables'.
        使用lambdas在Kotlin中重写“JavaCode4.task4()”:如果集合包含偶数，则返回true。
        通过使用代码补全功能，您可以找到调用“Collection”的适当函数。不要使用“Iterables”类。
    """,
    documentation = doc4(),
    references = { JavaCode4().task4(collection) })

fun task4(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }// 判断一个集合中是否包含偶数，any方法就是当任一元素符合时 返回true