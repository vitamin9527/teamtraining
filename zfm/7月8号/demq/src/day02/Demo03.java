package day02;

import java.util.Scanner;

/**
 * 3.模拟QQ登陆，输入账号与密码，如果账号与密码正确则显示登录成功，
如果失败则重新登录，并显示登录错误几次，如果登录错误三次则程序结束登录失败。
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int count = 0;//定义登陆次数
		while(count!=3){//限制登陆次数
			System.out.println("请输入用户名");
			String userName = scan.nextLine();//接收用户名
			System.out.println("请输入密码");
			String password = scan.nextLine();//接收密码
			count ++;
			if(userName.equals("root") && password.equals("1234")){//判断是否正确
				System.out.println("登陆成功");
				return;//成功退出方法
			}else{
				System.out.println("登陆错误，错误次数为："+count);//错误显示错误次数
			}
		}
		scan.close();
		System.out.println("登陆失败");//三次失败后  登陆失败
		
		
	}

}
