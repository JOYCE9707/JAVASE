package cn.itcast_01;

import java.util.LinkedList;

/**
 * �Զ����ջ����
 * 
 * @author 
 * @version 
 */
public class MyStack {
	private LinkedList link;

	public MyStack() {
		link = new LinkedList();
	}
//ģ�����ݽ�ջ
	public void add(Object obj) {
		link.addFirst(obj);
	}
	
//get���� ģ�ⵯջ
	public Object get() {
		// return link.getFirst();
		return link.removeFirst();//�Ƴ������ش��б�ĵ�һ��Ԫ�ء�
	}

	public boolean isEmpty() {
		return link.isEmpty();
	}
}
