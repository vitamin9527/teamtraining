import java.util.Arrays;
import java.util.Scanner;

/**
 * 编写一个简单的字符游戏 (包括生成随机字符，去重，判断猜对的个数  并给提示)
 */
public class CharGame {
    public static void main(String[] args) {
        char result[] = caseNumber();//接收随机字符
        System.out.println(result);
        while(true){//循环猜
            Scanner sc = new Scanner(System.in);
            System.out.println("请开始。");//提示
            char [] user = sc.nextLine().toUpperCase().toCharArray();//将全部转为大写并且转为数组
            if(String.valueOf(user).equals("EXIT")){//当输入exit时退出游戏
                System.out.println("再见");
                return;
            }
            System.out.println(user);
            if(user.length!=5){//当长度不符合时提示
                throw new RuntimeException("字符长度只能为五");
            }
            int math[] =  check(user,result);//接收反馈参数
            if(math[0]==5){//当正确率为5的时候成功
                System.out.println("恭喜你！");
                return;
            }
            System.out.println("还没猜对哦，你猜对了"+math[0]+"个");
        }
    }
    /*
    随机生成字符  并且去重
     */
  public static char[] caseNumber(){
      char result[] = new char[5];
      char caseNum[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};//全部的字符选取
      boolean flag[] = new boolean[caseNum.length];//创建一个booolean数组  用来去重使用 默认为false
      for(int i=0;i<5;i++){//随机字符为个  循环生成
          int index = (int)(Math.random()*26);//获取随机下标
          do{
               index = (int)(Math.random()*26);//
          }while(flag[index]);//当index下标的标记为false时，就是还没使用
          result[i] = caseNum[index];//存放于数组中
          flag[index] = true;//将其下标所代表的布尔值改为true 当下次进入循环时 则会重新对index经行随机

      }
      return result;
    }

    /*
    该方法用于对比用户输入字符以及随机字符的对比
     */
    public static int[] check(char[]user,char[]result){
        int math[] = new int[2];//用来存放猜对的个数
        for(int i=0;i<5;i++){//循环读取用户输入的字符
            for(int j=0;j<5;j++){//随机产生的字符
                if(user[i]==result[j]){//如果猜对一个
                    math[0]++;//计量
                }else{
                    math[1]++;//没猜对个数
                }
            }
        }
        return math;
    }
}
