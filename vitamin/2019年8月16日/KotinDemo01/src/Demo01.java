import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

/**
 * 公司：赛安服
 * 文件名：Demo01
 * 作者：Administratora
 * 时间：2019/8/16 15:30
 * 描述：
 */


public class Demo01 {
    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner sann = new Scanner(System.in);
        System.out.println("你输入的内容是：" + sann.next());
        Random random = new Random();
        System.out.println("第一个(10以内)随机数是：" + random.nextInt(10));
        System.out.println("第二个（100以内的随机数是：）" + random.nextInt(100));
        //英文字母中的任意一个字母
        int num = (int) 'a';
        int last = (int) 'z';
        System.out.println("第三个英文字母小写的随机数是" + ((char) (random.nextInt(last - num) + num + 1)));
        int index = (int) 'A';
        System.out.println("第三个英文字母大写的随机数是" + ((char) (random.nextInt(last - num) + index + 1)));
        int inx = random.nextInt(last - index) + index + 1;
        while (inx > (last - num + index) && inx < num) {
            inx = random.nextInt(last - index) + index + 1;
        }
        System.out.println("第四个英文字母大小写的随机数是" + ((char) inx));

    }
}
