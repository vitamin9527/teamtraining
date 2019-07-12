package Demo4;

import java.util.Scanner;

public class D8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(52.2f/10);
        int length = sc.nextInt();
        String arr[] = new String[length];
        for(int i=0;i<length;i++){
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            double BMI = weight/(height*height);
            int count = (int)(BMI*10);
            System.out.println(count);
             BMI = count/10;
            System.out.println(BMI);
            if(BMI<18.5){
                arr[i] = "Under";
            }else if(18.5<= BMI && BMI<25.0){
                arr[i] = "Normal";
            }else if(25.0<=BMI && BMI<30.0){
                arr[i] = "Over";
            }else{
                arr[i] = "obese";
            }
        }
        for(String s : arr){
            System.out.print(s+" ");
        }
    }
}
