import java.util.Scanner;

/**
 * 公司：赛安服
 * 文件名：Demo03
 * 作者：Administratora
 * 时间：2019/8/16 16:58
 * 描述：
 */


public class Demo03 {
    //一段字母片段中有几个大写字母，几个小写字母，几个数字
    public static void main(String[] args) {
        Scanner scnn = new Scanner(System.in);
        String string =scnn.nextLine();
        System.out.println(string);
        int num = (int) 'a';
        int last = (int) 'z';
        int index = (int) 'A';
        int maths = (int) '0';
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        for (char c : string.toCharArray()) {
            int cint = (int) c;
            if (cint >= index && cint <= index + last - num) {
                c1++;
            } else if (cint >= num && cint <= last) {
                c2++;
            } else if (cint >= maths && cint <= maths + 9) {
                c3++;
            } else {
                c4++;
            }
        }
        System.out.println("大写字母有：" + c1);
        System.out.println("小写字母有：" + c2);
        System.out.println("数字有：" + c3);
        System.out.println("其他有：" + c4);
        System.out.println("总字符有：" + string.toCharArray().length);
    }
}
