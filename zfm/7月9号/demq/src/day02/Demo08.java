package day02;

import java.util.Arrays;

/**
 * 将以下字符串按逗号分割，将得到的字符串数组转化为int数组，排序，遍历输出。
字符串如下："120,11,32,135,234,91,18"
 * @author Administrator
 *
 */
public class Demo08 {
	public static void main(String[] args) {
		String str = "120,11,32,135,234,91,18";
		String s[] = str.split(",");//根据逗号进行分割
		int arr[] = new int[s.length];//创建数组接收数据
		for(int i=0;i<s.length;i++){//遍历
			arr[i] = Integer.parseInt(s[i]);//强转为数字类型
		}
		Arrays.sort(arr);//排序
		for(int i:arr){//遍历
			System.out.println(i);
		}
		}

}
