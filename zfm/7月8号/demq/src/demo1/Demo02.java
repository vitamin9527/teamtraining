package demo1;

import java.io.File;
import java.io.IOException;

/**
 * io流练习
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) throws IOException {
		File file = new File("demo");//创建一个文件
		if(!file.exists()){//判断是否存在
			file.createNewFile();//如果不存在  创建
			System.out.println("true");
		}
	}
	
}
