package Day01

/**
 * 定义变量
 */
class TypeDemo {
}
        fun main(args : Array<String>){
            // val 定义制度局部变量使用关键字 val定义 只能为其赋值一次
            val a : Int = 1// 立即复制
            val b = 2;// 自动推断出Int类型
            val c : Int;
            c = 3;// 明确赋值
            //c = c + 1; // 只读 不可修改

            //var 可重新赋值的变量使用 var关键字
            var d = 5;//自动推断为Int类型
            d += 1;// 可修改
        }

