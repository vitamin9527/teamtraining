package day02;

import java.util.Arrays;

/**
 * 利用Math类获取5个随整数范围在(15,30)，不能重复，放在数组中，冒泡排序后遍历输出
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		int arr[] = new int[5];//创建新数组用于接收
		for(int i=0;i<5;i++){//循环生成
			int num = (int) (Math.random()*(30-15)+15);//生成随机数
			if(check(arr,num)){//判断数字是否存在
					i--;//存在  循环减一  重新生成
			}else{//不存在
				arr[i] = num;//赋值
			}
		}
		pai(arr);//冒泡排序
		System.out.println(Arrays.toString(arr));//输出
		
	}
	public static boolean check(int arr[],int num){
		for(int i=0;i<arr.length;i++){//把数组和数字传入
			if(arr[i]==num){//经行遍历对比
				return true;//存在 则返回true
			}
		}
		return false;//不存在  则返回 false
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
