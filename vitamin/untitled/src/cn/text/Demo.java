package cn.text;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo {
    private String name;

    public void a() {
        List list = new ArrayList();
        Set set = new HashSet();
    }

    public Demo() {
        super();
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 16, 2};
        print(arr);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        List list = new ArrayList();
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}