package day01

/**
 * 集合使用
 */
class ColltionDemo {
}
    fun main(args : Array<String>){
        var lists = listOf("a","b")// 创建一个list集合，只读List
        //var list = arrayListOf()// 创建一个arrays集合  可修改
        //var list = mapOf()// 创建map集合
        for (list in lists){// 对集合进行遍历 迭代
            print(list)// 打印输出集合里面的元素 结果 a b
        }
        var maps = mutableMapOf<Int,String>();//map集合
        maps.put(1,"g")//当需要使用此api为map集合添加元素时，需要使用mutableMapof 这样创建的是可修改map，当只使用mapof时为只读
        maps.put(2,"k")
        // 访问maps
        print(maps[1]);
        maps[1] = "g"
        for ((k,v) in maps){// map的集合遍历
            print("($k,$v)")
        }
    }