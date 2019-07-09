package day02;

import java.util.Scanner;

/**
 * 键盘录入一个字符串，要求长度为8，不符合输出错误；符合条件，将字符串中所有大写字符替换成'M'   
 * @author Administrator
 *
 */
public class Demo02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		String str = sc.nextLine();
		if(str.length()!=8){//限制长度，只能为8 否则抛异常
			throw new Exception("个数只能为8，你的长度为："+str.length());
		}
		String s = "";
		for(int i=0;i<str.length();i++){//循环读取
			char c = str.charAt(i);
			if('A'<=c && 'Z'>=c){//判断是否为大写字母
				 s = str.replace(c, 'M');//替换
			}
		}
		System.out.println(s);
		sc.close();
		
	}
}
