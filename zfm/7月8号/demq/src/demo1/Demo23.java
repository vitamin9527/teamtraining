package demo1;

import java.io.BufferedReader;
import java.io.File;
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
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择文件");//接收客户自定义选择的文件名称
		String filename = sc.nextLine();
		File file = new File(filename);
		if(!file.exists()){//判断文件是否存在
			throw new FileNotFoundException("文件不存在");
		}
		FileInputStream fis = new FileInputStream(filename);//创建文件输入流
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");//转换为字符流
		BufferedReader bw = new BufferedReader(isr);//缓冲字符流
		String line = null;
		while((line=bw.readLine()) != null){//循环判断读取内容判断是否为null
			System.out.println(line);//输出里面内容
		}
		bw.close();//关闭流
		sc.close();//关闭输入
	}

}
