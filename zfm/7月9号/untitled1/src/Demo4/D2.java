package Demo4;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input data");
        int length = sc.nextInt();
        int sum = 0;
        for(int i=0;i<length;i++){
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("answer");
        System.out.println(sum);
    }
}
