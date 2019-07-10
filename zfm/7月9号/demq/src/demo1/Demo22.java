package demo1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * 往指定文件夹中写入内容
 * @author Administrator
 *
 */
public class Demo22 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择文件");//自定义输入文件名
		String filename = sc.nextLine();//接收用户输入的数据
		File file = new File(filename);
		if(!file.exists()){//判断文件是否存在
			throw new FileNotFoundException("文件不存在");
		}
		FileOutputStream fis = new FileOutputStream(filename);//创建文件输出流
		OutputStreamWriter osr = new OutputStreamWriter(fis,"utf-8");//转换为字符流
		BufferedWriter bw = new BufferedWriter(osr);//字符缓冲流
		PrintWriter pw = new PrintWriter(bw,true);//文本输出流打印
		System.out.println("请输入内容：");
		while(true){//循环写入
			String line = sc.nextLine();//接收输入内容
			if("exit".equals(line)){//当输入exit时结束 退出方法
				break;
			}
			pw.println(line);//写入文件
		}
		System.out.println("over");
		pw.close();//关闭写入流
		sc.close();//关闭输入
		
	}

}
