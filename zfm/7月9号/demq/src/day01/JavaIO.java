package day01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 书写javaio包中的常用类
 * @author Administrator
 *
 */
public class JavaIO {
	public static void main(String[] args) throws Exception {
		File file = new File("text.doc");//该类主要用于文件和目录的创建、文件的查找和文件的删除等
		file.exists();//判断抽象路径名表示的文件或目录是否存在 返回为boolean值
		file.mkdirs();//创建此抽象路径名指定的目录，包括创建必需但不存在的父目录
		file.mkdir();//创建此抽象路径名指定的目录
		file.listFiles();//返回一个抽象路径名数组，这些路径名表示此抽象路径名所表示目录中的文件
		file.delete();//删除此抽象路径名表示的文件或目录
		file.isDirectory();//测试此抽象路径名表示的文件是否是一个目录
		file.isFile();//测试此抽象路径名表示的文件是否是一个标准文件
		file.length();//返回由此抽象路径名表示的文件的长度
		
		FileInputStream fis = new FileInputStream(file);//读取文件的字节流
		BufferedInputStream bis = new BufferedInputStream(fis);//向文件写入的字节流
		FileOutputStream fos = new FileOutputStream(file) ;//向文件输出数据 的输出字节流
		BufferedOutputStream  bos = new BufferedOutputStream(fos);// 该类出现的目的是为了提高向文件写数据的效率
		InputStreamReader Isr = new InputStreamReader(fis);//将字节流转换为字符流
		OutputStreamWriter osw = new OutputStreamWriter(fos);//将输出字节流转换为输出字符流
		BufferedReader br = new BufferedReader(Isr);//缓冲字符流 提高读效率
		BufferedWriter bw = new BufferedWriter(osw);//缓冲字符流 提高写效率
		
		//IOException 处理io流中可能发生的异常
		
		//FilenotFounfExceptiom 文件找不到异常 用于处理文件时  文件不存在的异常
		
		
	}

}
