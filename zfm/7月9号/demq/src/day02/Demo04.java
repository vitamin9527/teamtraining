package day02;

import java.util.Scanner;

/**
 * 利用Scanner输入一个字符串，再利用Scanner输入一个字符，查找该字符在上述字符串中的位置，并输出该位置
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符");
		String line = sc.nextLine();
		System.out.println("请输入你要查询的字符");
		String c = sc.nextLine();
		/*int index = line.indexOf(c)+1;
		System.out.println("查询的字符在第  "+index+" 位");
		sc.close();*/
		for(int i=0;i<line.length();i++){//考虑查询的字符存在多个
			String c1 = line.charAt(i)+"";
			if(c.equals(c1)){
				i++;
				System.out.println("查询的字符在第  "+i+" 位");
			}
		}
		sc.close();
	}

}
