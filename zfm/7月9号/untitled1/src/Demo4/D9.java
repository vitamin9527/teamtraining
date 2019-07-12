package Demo4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class D9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        LinkedHashMap<Integer,Integer>map = new LinkedHashMap<Integer,Integer>();
        int arr[] = new int[length*2];
        for(int i=0;i<length;i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int a = (y1-y2)/(x1-x2);
            System.out.println(a);
            int b = ((y1+y2)-(x1*a+x2*a))/2;
            System.out.println(b);
            map.put(a,b);
        }
        for(int s:map.keySet()){
            System.out.print("("+s+" "+map.get(s)+") ");
        }
                ;
    }
}
