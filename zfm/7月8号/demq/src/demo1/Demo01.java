package demo1;

import java.util.Scanner;
/**
 * Scanner¡∑œ∞
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("«Î ‰»Î");
		String username = sc.nextLine();
		sc.close();
		String name  = "¿Î";
		if(username.equals(name)){
			System.out.println("≈∂ªÌ");
		}else{
			System.out.println("ﬂ◊");
		}
		
	}
	}

