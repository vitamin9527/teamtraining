package day02;

import java.util.Scanner;

/**
 * 键盘录入一个字符串，统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符) 
 * @param args
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入（字母，数字）");//提示输入
		String line = scan.nextLine();//接收
		int upnamcount = 0;//统计大写字母数量
		StringBuffer upnam = new StringBuffer("");//统计大写字母
		int downnamcount = 0;//统计小写字母数量
		StringBuffer downnam = new StringBuffer("");//存放小写字母
		int numbercount = 0;//统计数字数量
		StringBuffer number = new StringBuffer("");//存放数字
		for(int i=0;i<line.length();i++){//循环截取
			char c = line.charAt(i);
			if('A'<=c && 'Z'>=c){//判断是否为大写字母
				upnamcount ++;//数量加1
				upnam.append(c);//存放
			}
			if('a'<=c && 'z'>=c){//判断是否为小写字母
				downnamcount ++;//数量加1
				downnam.append(c);//存放
			}
			if('0'<=c && '9'>=c){//判断是否为数字
				numbercount ++;//数量加1
				number.append(c);//存放
			}
		}
		//输出
		System.out.println("大写字母个数为"+upnamcount+";分别是:"+upnam);
		System.out.println("小写字母个数为"+downnamcount+";分别是:"+downnam);
		System.out.println("数字字母个数为"+numbercount+";分别是:"+number);
		scan.close();
	}

}
