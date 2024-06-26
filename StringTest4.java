package string;
/*
 * 把数组中的数据按照指定格式拼接成一个字符串
 * 举例：int[] arr = {1,2,3};
 * 输出结果：[1,2,3]
 * 
 * 分析：
 * 		A：定义一个int类型的数组
 * 		B：写方法实现把数组中的元素按照指定的格式拼接成一个字符串
 * 		C：调用方法
 * 		D：输出结果
 */
public class StringTest4 {

	public static void main(String[] args) {
		//定义一个int类型的数组
		int[] arr = {1,2,3};
		
		//写方法实现把数组中的元素按照指定的格式拼接成一个字符串
		
		//调用方法
		String s = arrayToString(arr);
		
		//输出结果
		System.out.println("s: "+s);
	}
	/*
	 * 两个明确：
	 * 		返回值类型：String
	 * 		参数列表：int[] arr
	 */
	public static String arrayToString(int[] arr) {
		String s = "";
		
		//[1, 2, 3]
		s += "[";
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				s += arr[i];
			}else {
				s += arr[i];
				s += ",";
			}
		}
		s += "]";
		
		return s;
	}

}
