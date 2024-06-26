package string;
/*
 * String类的获取功能：
 * int length():获取字符串的长度，其实也就是字符个数
 * char charAt(int index):获取指定索引处的字符
 * int indexOf(String str):获取str在字符串对象中第一次出现的索引
 * String substring(int start):从start开始截取字符串
 * String substring(int start,int end):从start开始，到end结束截取字符串
 */
public class StringDemo4 {

	public static void main(String[] args) {
		//创建字符串对象
		String s = "helloworld";
		
		//int length():获取字符串的长度，其实也就是字符个数
		System.out.println(s.length());
		System.out.println("----------");
		
		//char charAt(int index):获取指定索引处的字符
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println("----------");
		
		//int indexOf(String str):获取str在字符串对象中第一次出现的索引
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("owo"));
		System.out.println(s.indexOf("ak"));
		System.out.println("----------");
		
		//String substring(int start):从start开始截取字符串
		System.out.println(s.substring(0));
		System.out.println(s.substring(5));
		System.out.println("----------");
		
		//String substring(int start,int end):从start开始，到end结束截取字符串
		System.out.println(s.substring(0,s.length()));
		System.out.println(s.substring(3,8));
		

	}

}
