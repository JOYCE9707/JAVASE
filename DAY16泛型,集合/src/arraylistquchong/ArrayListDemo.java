package arraylistquchong;

import java.util.ArrayList;


/*
 * ArrayList去除集合中字符串的重复值(字符串的内容相同)
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:添加多个字符串元素(包含内容相同的)
 * 		C:创建新集合
 * 		D:遍历旧集合,获取得到每一个元素
 * 		E:拿这个元素到新集合去找，看有没有
 * 			有：不搭理它
 * 			没有：就添加到新集合
 * 		F:创建新集合
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();

		// 添加多个字符串元素(包含内容相同的)
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("java");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("world");
		array.add("java");
		array.add("world");
		//创建新集合
		ArrayList<String> newarray = new ArrayList<String>();
		/*遍历旧集合,获取得到每一个元素
		 * 		E:拿这个元素到新集合去找，看有没有
		 * 			有：不搭理它
		 * 			没有：就添加到新集合
		 * */
		for(String s :array){
			if (!newarray.contains(s)) {
				newarray.add(s);
			}
		}
		//创建新集合
		for(String ss:newarray){
			System.out.println(ss);
		}
		

	}
}
