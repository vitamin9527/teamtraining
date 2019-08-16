package i_introduction._8_Smart_Casts

import util.TODO
import util.doc8

// 'sealed' modifier restricts the type hierarchy:
// all the subclasses must be declared in the same file
sealed class Expr

class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
// Sum Num 继承于Expr类
fun eval(e: Expr): Int =// 创建判断函数 传入Expr参数
    when (e) {// 判断是那种类型
        is Num -> e.value// 如果是Num类型 进入此输出 调用value方法
        is Sum ->eval(e.left) + eval(e.right)// 如果是Sum类型 进入此输出 转换 在调用eval
        else -> throw IllegalArgumentException("Unknown expression")// 如果都不是 输出异常
    }

fun todoTask8(expr: Expr): Nothing = TODO(
    """
        Task 8.
        Complete the implementation of the 'eval' function above using smart casts and 'when' expression.
        The 'JavaCode8.eval' method provides the similar functionality written in Java.
    """,
    documentation = doc8(),
    references = { JavaCode8().eval(expr) })

