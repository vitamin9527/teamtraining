package day02;
/**
 * .将由三个字符组成的单词输出，并统计个数： 
 * String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
 * @author Administrator
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		String s1[] = s.split(",");//先根据”，“进行拆分
		int count = 0;//计量三个字符的字数
		for(int i=0;i<s1.length;i++){//循环遍历
			String s2[] = s1[i].split(" ");//再根据” “拆分
			for(int j=0;j<s2.length;j++){//循环遍历
				if(s2[j].length()==3){//判断长度是否为3
					count++;//数量加一
					System.out.println(s2[j]);//输出三个字母
				}
			}
		}
		System.out.println("三个字符的个数有："+count);
	}

}
