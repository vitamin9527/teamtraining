package day02;

import java.util.Arrays;

/**
 * .String str = "svd9876fsb543fdg210";将字符串中所有偶数转为int[] 数组，再对数组冒泡排序，
 * 最后使用Arrays输出数组
 * @author Administrator
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		String str = "svd9876fsb543fdg210";
		StringBuffer bf = new StringBuffer();
		for(int i=0;i<str.length();i++){
			char cha = str.charAt(i);
			if(cha>48 && cha<=57){//数字的ASCII码
				bf.append(cha);
			}
		}
		int arr[] = new int[bf.length()];//创建一个存放数字的数组
		for(int j=0;j<bf.length();j++){//循环遍历
			String ch = bf.charAt(j)+"";//得到每个字符
			int number = Integer.parseInt(ch);//把字符强转为数字类型
			if(number%2 == 0){//判断是否为偶数
				arr[j] = number;//是偶数  存入复制
			}
		}
		System.out.println(bf);
    	pai(arr);//冒泡排序
		System.out.println(Arrays.toString(arr));//输出
	}
	
	public static void pai(int arr[]){//冒泡排序
		for(int i=0;i<arr.length;i++){//循环 次数 把每一个都跟其他数经行对比
			for(int j=0;j<arr.length-1-i;j++){//对比
				if(arr[j]>arr[j+1]){//如果比下一个数大 则经行位置交换 依次进行
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
