package day02;

import java.util.Scanner;

/**
 * 键盘录入一个字符串，利用正则表达式判断是否是一个qq邮箱
 * @author Administrator
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入邮箱：");
		String email = sc.nextLine();//接收用户输入的邮箱号
		String regax = "[1-9a-zA-Z]+@[1-9A-Za-z]+[.]com?" ;//确认正则表达式
		boolean flag = email.matches(regax);//使用api验证
		if(flag){
			System.out.println("ok");
		}else{
			System.out.println("邮箱格式错误");
		}
		sc.close();
	}

}
