package day01;


/**
 * 练习javalang包中的相关类
 * @author Administrator
 *
 */
public class JavaLang {
	public static void main(String[] args) {
		Boolean flag = null; //boolean类型的包装类  可以为null 布尔
		
		Byte b1 = null; //byte的包装类  可以为null 字节
		
		Double b2 = null;//double的包装类 可以为null 小数
		
		Float f = null;//浮点型小树的包装类
		
		Integer i = null;//整数类型的包装类
		
		Long l = null;//长整形的包装类
		
		//nullpointException  空指针异常 当你在一些数组操作中  你所访问的位置是不存在的，就会在运行期出现此异常
		
		//numberFormatException 数据类型转换异常  当对一个数值进行数据转换时，当你所转换得值不是你所需要得数据类型时，就会出现此异常
		
		Object c = null;
		Object o1 = 2.3;//超类 大多数得类都直接或者间接得继承了这个类，
		
		//override  重写 （注释）发生于父子类中 重写父类方法
		new Thread(new Runnable(){//runnable 创建线程的方式之一，继承于Runnable接口 重写run 方法
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		}).start();
		
		//RunntimeException 运行期异常  用于处理程序要运行期间 所会出现的异常
		
		Short s = null;//整型的包装类 可以为null
		
		String s1 = "s";//String ,字符串类型	
		s1.length();//获取字符串长度 
		s1.trim();//清除字符串两边空白
		s1.charAt(0);//获取指定字符
		s1.indexOf(0);//查找指定字符
		s1.lastIndexOf(0);//查找指定字符最后出现的位置
		s1.split("s");//根据指定字符进行拆分 返回值为数组
		s1.substring(0);//获取指定位置的字符串
		s1.replace("c", "v");//字符串替换
		s1.matches("ss");//正则表达式替换
		
		StringBuffer sf = new StringBuffer("sd");//可变字符  线程安全的 效率低
		sf.append("fg");//增加元素
		sf.length();//获取长度
		sf.toString();//转换为字符
		sf.delete(0, 1);//删除指定位置元素
		sf.replace(0, 2, "sc");//替换指定位置的字符
		sf.substring(0);//截取指定位置的字符串
		sf.indexOf("s",0);//查找指定字符串
		
		StringBuilder sd = new StringBuilder("sl");//可变字符串 线程不安全的 效率高
		sd.append("b");//增加字符
		sd.length();//获取字符串长度
		sd.charAt(0);//获取指定的字符
		sd.substring(0);//截取指定位置的字符串
		
		new Thread(){//创建线程的方式 继承于thread类
			public void run(){
				
			}
		}.start();;
	}
}
 


