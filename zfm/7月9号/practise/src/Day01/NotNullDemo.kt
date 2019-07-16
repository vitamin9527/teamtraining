package day01

import java.io.File
import java.lang.IllegalArgumentException

/**
 * NotNull相关
 */
class NotNullDemo {
}



    fun main(args : Array<String>){
        // if not null 缩写
        val files = File("Test").listFiles()// 获取 ：Test文件下的所有子文件
        println(files?.size)// 输出为null “？”判断files 是否为空 如果为空 则输出为null 不为空 输出他的长度

        // if not null and else 缩写
        val file = File("Test").listFiles()// 获取 ：Test文件下的所有子文件
        println(file?.size ?: "empty")// 输出为empty  “？”判断file 是否为空 如果为空 则输出为empty 不为空 输出他的长度

        // if null 执行一个语句
        val values = mapOf<String,String>()
        val email = values["email"] ?: throw IllegalArgumentException()
        // 在可能为空的集合中去第一元素
        val emailes = listOf<String>()
        val mainEmail = emailes.firstOrNull() ?: " "// 输出为” “
        println(mainEmail)

        // if not null 执行代码

    }