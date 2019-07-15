package Day01

/**
 * 集合使用
 */
class ColltionDemo {
}
    fun main(args : Array<String>){
        var lists = listOf("a","b")// 创建一个list集合
        //var list = arrayListOf()// 创建一个arrays集合
        //var list = mapOf()// 创建map集合
        for (list in lists){// 对集合进行遍历 迭代
            print(list)// 打印输出集合里面的元素 结果 a b
        }
        var maps = mutableMapOf<Int,String>();//map集合
        maps.put(1,"g")
        maps.put(2,"k")
        for ((k,v) in maps){// map的集合遍历
            print("($k,$v)")
        }
    }