package cn.itcast_01;

import java.util.LinkedList;

/**
 * 自定义的栈集合
 * 
 * @author 
 * @version 
 */
public class MyStack {
	private LinkedList link;

	public MyStack() {
		link = new LinkedList();
	}
//模拟数据进栈
	public void add(Object obj) {
		link.addFirst(obj);
	}
	
//get方法 模拟弹栈
	public Object get() {
		// return link.getFirst();
		return link.removeFirst();//移除并返回此列表的第一个元素。
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}
