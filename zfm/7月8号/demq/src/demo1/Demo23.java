package demo1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo23 {
/**
 * 读取指定文件夹
 * @param args
 * @throws FileNotFoundException 
 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择文件");
		String filename = sc.nextLine();
		FileInputStream fis = new FileInputStream(filename);
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader bw = new BufferedReader(isr);
		String line = null;
		while((line=bw.readLine()) != null){
			System.out.println(line);
		}
		bw.close();
		sc.close();
	}

}
