package string;
/*
 * String类的转换功能：
 * char[] toCharArray():把字符串转换为字符数组
 * String toLowerCase():把字符串转换为小写字符串
 * String toUpperCase():把字符串转换为大写字符串
 * 
 * 字符串的遍历：
 * 		A：length()加上charAt()
 * 		B：把字符串转换为字符数组，然后遍历数组
 */
public class StringDemo5 {

	public static void main(String[] args) {
		//创建字符串对象
		String s = "abcde";
		
		//char[] toCharArray():把字符串转换为字符数组
		char[] chs = s.toCharArray();
		for(int i=0;i<chs.length;i++) {
			System.out.println(chs[i]);
		}
		System.out.println("----------");
		
		//String toLowerCase():把字符串转换为小写字符串
		System.out.println("HelloWorld".toLowerCase());
		//String toUpperCase():把字符串转换为大写字符串
		System.out.println("HelloWorld".toUpperCase());
	}

}
