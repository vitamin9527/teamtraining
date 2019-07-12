package Demo4;

import java.util.Scanner;

/**
 * 四舍五入
 */
public class D7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(-(0.5*-3));
        int length = sc.nextInt();
        int arr[] = new int[length];
        for(int i=0;i<length;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a/b>=0){
                if(b<0){
                    int num = -(a%b);
                    if(num>=-(0.5*b)){
                        arr[i] = (a/b)+1;
                        continue;
                    }
                }else{
                    int num = a%b;
                    if(num>=(0.5*b)){
                        arr[i] = (a/b)+1;
                    }else if(num==0){
                        arr[i] = a/b;
                    }else{
                        arr[i] = a/b;
                    }
                }

            }
            if(a/b<0){
                if(b>0){
                    int num = -(a%b);
                    if(num>=0.5*b){
                        arr[i] = a/b-1;
                    }else if(num==0){
                        arr[i] = a/b;
                    }else{
                        arr[i] = a/b;
                    }
                }
                if(b<0){
                    int num = (a%b);
                    if(num>=0.5*-b){
                        arr[i] = a/b-1;
                    }else if(num==0){
                        arr[i] = a/b;
                    }else{
                        arr[i] = a/b;
                    }
                }
            }

        }
        for(int c:arr){
            System.out.print(c+" ");
        }
    }
}

