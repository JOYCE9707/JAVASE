package collectiontest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求：存储字符串并遍历。
 * 
 * 分析：
 * 		A:创建集合对象
 * 		B:创建字符串对象
 * 		C:把字符串对象添加到集合中
 * 		D:遍历集合
 */
public class CollectionTest{
	public static void main(String[] args) {
		Collection cc = new ArrayList();
		
		
		cc.add("周星驰");
		cc.add("周杰伦");
		cc.add("王力宏");
		cc.add("林俊杰");
		cc.add("张杰");
		//D:遍历集合
		Iterator it = cc.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
			
			
		}
	}
}