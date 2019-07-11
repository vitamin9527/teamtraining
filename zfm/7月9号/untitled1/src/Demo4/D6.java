package Demo4;

import java.util.Arrays;
import java.util.Scanner;

public class D6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int arr[] = new int[300];
        while(true){
            int num = sc.nextInt();
            if (!sc.hasNext()){
                return;
            }
            arr[count++] = num;
            for(int i=1;i<count;i++){
                for(int j=0;j<count-i;i++){
                    if(arr[j]<arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(arr[0]+" "+arr[count]);
        }

    }
}
