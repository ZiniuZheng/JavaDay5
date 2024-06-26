package string;


import java.util.Scanner;
/*
 * 把字符串反转
 * 
 * 分析：
 * 		A：键盘录入一个字符串
 * 		B：写方法实现反转
 * 			String -- StringBuilder -- reverse() -- String
 * 		C：调用方法
 * 		D：输出结果
 */
public class StringBuilderTest3 {

	public static void main(String[] args) {
		//键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		
		//写方法实现反转
		
		//调用方法
		String result = myReverse(s);
		
		//输出结果
		System.out.println("result: "+result);
	}
	
	/*
	 * 两个明确：
	 * 		返回值类型：String
	 * 		参数列表：String
	 */
	public static String myReverse(String s) {
		//String -- StringBuilder -- reverse() -- String
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String result = sb.toString();
		return result;
	}

}
