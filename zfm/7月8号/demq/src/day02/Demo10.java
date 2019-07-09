package day02;
/**
 * .产生一个长度为15位的随机字符串：大写小写和数字，最后输出该随机字符串。
 * @author Administrator
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer();//用来存放字符串
		char cha;//存放字母
		int number;//存放数字
		for(int i=0;i<15;i++){//生成15，遍历
			int c =  (int)(Math.random()*10000);//转型，增加随机概率
			int type =c%3+1;//判断生成类型
			switch(type){//选择生成类型
			case 1://数字
				number = (int)(Math.random()*10);
				System.out.print(number);
				sf.append(number);
				break;
			case 2://大写
				number = (int)(Math.random()*(90-65)+65);
				cha = (char)number;
				System.out.print(cha);
				sf.append(cha);
				break;
			case 3://小写
				number = (int)(Math.random()*(122-97)+97);
				cha = (char)number;
				System.out.print(cha);
				sf.append(cha);
				break;
			}
		}
		

	}

}
