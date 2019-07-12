package Demo4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 冒泡排序
 */
public class D10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for(int i=0;i<length;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        int space = 0;
        int a = 0;
        for(int i=0;i<arr.length;i++){
            count++;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    space++;
                    a++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(a!=0){
                count--;
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count+" "+space);
    }
}
