package Demo4;
import java.util.Scanner;
public class D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr [] = new int[length];
        for(int i=0;i<length;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println();
            if(a>b){
                arr[i] = b;
            }else{
                arr[i] = a;
            }
        }
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
