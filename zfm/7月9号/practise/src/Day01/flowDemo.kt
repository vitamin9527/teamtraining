package day01

/**
 * 关于循环
 */
class flowDemo {
}
        fun main(args : Array<String>){
            // for 循环
            // 输出打印1-10
            for(i in 1..10){// 范围 1<=i && i<=10
                println(i)// 打印结果为12345678910
            }

            // 倒序输出 10-0
            for(i in 10 downTo 0){
                println(i)//打印结果为 10987654321
            }

            // 修改step 每次循环的布数
            for(i in 1..10 step 2){// 每次循环增加2
                print(i)// 答应结果为 13579
            }

            // 含头不含尾
            for(i in 1 until  10 ){//  不包含10
                print(i)// 打印结果为 123456789
            }


        }



