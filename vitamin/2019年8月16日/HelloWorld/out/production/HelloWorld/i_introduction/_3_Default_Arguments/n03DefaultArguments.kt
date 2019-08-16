package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
    """
        Task 3.
        Several overloaded 'foo' functions in the class 'JavaCode3' can be replaced with one function in Kotlin.
        Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
        You have to add 'foo' parameters and implement its body.
        Uncomment the commented code and make it compile.
        类“JavaCode3”中的几个重载“foo”函数可以用Kotlin中的一个函数替换。修改函数“foo”的声明，使使用“foo”的代码可以编译。

您必须添加'foo'参数并实现它的主体。取消已注释代码的注释，并使其编译
    """,
    documentation = doc2(),
    references = { name: String -> JavaCode3().foo(name); foo(name) })

//fun foo(name: String): String = todoTask3()
fun foo(name: String,number: Int=42,  toUpperCase: Boolean= false): String = (if(toUpperCase) name.toUpperCase()  else name) + number
// 重载的复用性 载kotlin中 形参都定义之后，后面的参数直接访问这一个函数即可 一定要参数内已有的函数，当传入的参数不是全部时，其他的形参必须带默认参数
fun task3(): String {
    //todoTask3()
    return  (foo("a")+
            foo("b", number = 1)+
            foo("c", toUpperCase = true)+
            foo(name = "d", number = 2, toUpperCase = true))

}