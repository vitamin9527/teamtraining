package day01


class IfDemo {
}

    fun main(args: Array<String>) {
        var i = maxOf(3, 6);// i = 6
        if (i in 1..4) {
            print("true")// 输出结果为false
        }

        // when表达式
        var x = 5;
        when(x){
            3 -> println("is a $x")
            maxOf(5,6) -> print("Max")// 分支条件也可以是任意表达式
            in 1..10 -> print("is not range")// 也可以判断是否在其区间 不在 ！in
            //is String -> print("yes") 检测一个值是（is）或者不是（!is）一个特定类型的值。注意：
            // 由于智能转换，你可以访问该类型的方法与属性而无需任何额外的检测。
            else -> println("otherwise")// 如果上述都不通过 则输出else 如果when 只作为一个表达式 则必须要有else
        }


    }

    /**
     *  if条件表达式
     */
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
        // if 作为表达式
        fun max(a: Int, b: Int) = if (a > b) a else b
    }



