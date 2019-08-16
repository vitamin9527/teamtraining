import java.util.Random;
import java.util.Scanner;

/**
 * 公司：赛安服
 * 文件名：Demo02
 * 作者：Administratora
 * 时间：2019/8/16 16:01
 * 描述：
 */


public class Demo02 {
    //猜字符游戏
    public static void main(String[] args) {
        Scanner scnn = new Scanner(System.in);
        Random random = new Random();
        Demo02 de = new Demo02();
        int num = (int) 'a';
        int last = (int) 'z';
        int index = (int) 'A';
        int inx = de.inxget(random, last, num, index);
        System.out.println("请输入你猜得单个字符");
        int inzs = 0;
        int next = de.srink(scnn);
        //    de. zoom(scnn,inx,inzs,next,de);
        //作弊器
        inzs = de.zoomup(scnn, inx, inzs, next, de, random, last, num, index);
        System.out.println("恭喜你猜对你一共猜了：" + inzs + "次");

    }

    public int zoomup(Scanner scnn, int inx, int inzs, int next, Demo02 de, Random random, int last, int num, int index) {
        while (next != inx) {
            System.out.println("进入循环");
            if (next > inx) {
                System.out.println("这个字符在你输入的字符前面");
                inx = de.inxget(random, last, num, index);
            } else {
                System.out.println("这个字符在你输入的字符后面");
                inx = de.inxget(random, last, num, index);
            }
            inzs++;
        }
        return inzs;
    }

    public void zoom(Scanner scnn, int inx, int inzs, int next, Demo02 de) {
        while (next != inx) {
            System.out.println("进入循环");
            if (next > inx) {
                System.out.println("这个字符在你输入的字符前面");
                next = de.srink(scnn);
            } else {
                System.out.println("这个字符在你输入的字符后面");
                next = de.srink(scnn);
            }
            inzs++;
        }
    }

    public int srink(Scanner scnn) {
        String str = scnn.next();
        int next = (int) str.toCharArray()[0];
        return next;
    }

    public int inxget(Random random, int last, int num, int index) {
        int inx = random.nextInt(last - index) + index + 1;
        while (inx > (last - num + index) && inx < num) {
            inx = random.nextInt(last - index) + index + 1;
        }
        return inx;
    }
}
