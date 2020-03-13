package listtest;

import java.util.ArrayList;
import java.util.List;

/*
 * List集合的特有遍历功能：
 * 		size()和get()方法结合使用
 */
public class ListDemo2 {
	public static void main(String[] args) {
	List list = new ArrayList();
	list.add("hello");
	list.add("world");
	list.add("java");
	
//	 Object get(int index):获取指定位置的元素
//			 System.out.println(list.get(0));
//			 System.out.println(list.get(1));
//			 System.out.println(list.get(2));
//			 IndexOutOfBoundsException
//			 System.out.println(list.get(3));

			// 用循环改进
			// for (int x = 0; x < 3; x++) {
			// System.out.println(list.get(x));
			// }
			// 如果元素过多，数起来就比较麻烦，所以我们使用集合的一个长度功能：size()
			// 最终的遍历方式就是：size()和get()
	
	for (int x=0;x<list.size();x++){
		
		System.out.println(list.get(x));
	}
	int a =0;
	
	//while
	while(a<list.size()){
		
		System.out.println(list.get(a));
		a++;
	}
	
	}
}
