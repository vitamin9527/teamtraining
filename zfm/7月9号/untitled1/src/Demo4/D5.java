package Demo4;

import java.util.Scanner;

public class D5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr [] = new int[length];
        for(int i=0;i<length;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
           if(a>b){
                if(b>c){
                    arr[i] = c;
                }else {
                    arr[i] = b;
                }
            }else {
                if(a<c) {
                    arr[i] = a;
                }else{
                    arr[i] = c;
                }
            }
        }
        for(int j=0;j<length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}


