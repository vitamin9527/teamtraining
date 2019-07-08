package day01;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 关于java中的util包中的常用类
 * @author Administrator
 *
 */
public class JavaUtil {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();//数组实现的集合 查找快 增删慢 允许重复
		list.add("s");//增加元素
		list.size();//获取集合长度
		list.isEmpty();//判断集合是否为空
		list.remove(0);//删除指定元素
		//list.get(0);//获取指定元素
		
		Date date = new Date();//时间类型 可以获取当前时间
		date.toString();//转换为字符串类型
		date.getTime();//返回内部存储的毫秒数从1970年7月1号0时0分开始
		date.setTime(0);//重新设置内存的毫秒数
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();// 线程不安全（允许null key和null value），存取速度快。底层是以哈希表实现的.
		map.put("s", 1);//存值  添加元素
		map.get("s");//根据key获取元素
		map.isEmpty();//判断是否为空
		map.containsKey("k");//判断key值是否存在
		map.size();//获取元素个数  集合长度
		map.clear();//清楚所有元素
		
		HashSet<String>set = new HashSet<String>();//线程不安全，存取速度快。底层是以哈希表实现的。不可重复
		set.add("a");//增加元素
		set.size();//获取集合长度
		set.toString();//转换为字符串 
		set.isEmpty();//判断是否为空 返回值为boolean
		set.clear();//清楚所有数据
		set.contains("d");//判断是否存在
		
		LinkedList<String> link = new LinkedList<String>();//线程不安全，存取速度快。底层是以哈希表实现的。
		link.add("a");//增加元素
		link.size();//获取集合长度
		link.get(0);//获取指定元素
		link.contains("S");//判断是否存在
		link.isEmpty();//判断是否为空 返回值为boolean
		link.clear();//清楚所有元素
		link.remove(0);//移除指定元素
		set.toString();//转换为字符串 
		
		Scanner snc = new Scanner(System.in);//可以提供系统输入的类
		String name = snc.nextLine();//接收字符串
		int i = snc.nextInt();//接收数字
		snc.close();//关闭输入
		
	}

}
