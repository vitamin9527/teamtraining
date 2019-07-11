package Demo4;

import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("data");
        int length = sc.nextInt();
        int result[] = new int[length];
        for(int i=0;i<length;i++){
            int a = sc.nextInt();
            int a1 = sc.nextInt();
            result[i] = a + a1;
        }
        System.out.println("answer");
       for(int j=0;j<result.length;j++){
           System.out.print(result[j]+" ");
       }

    }
}
