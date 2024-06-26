package string;
/*
 * 把数组拼接成一个字符串
 * 举例：
 * 		int[] arr = {1,2,3}
 * 结果：
 * 		[1, 2, 3]
 */
public class StringBuilderTest2 {

	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {1,2,3};
		
		//写方法实现拼接
		
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
		StringBuilder sb = new StringBuilder();
		//[1, 2, 3]
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(", ");
			}
		}
		sb.append("]");
		
		String result = sb.toString();
		
		return result;
	}

}
