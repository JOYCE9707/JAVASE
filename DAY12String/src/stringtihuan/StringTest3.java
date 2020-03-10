package stringtihuan;



/*
 * 统计大串中小串出现的次数
 * 举例：
 * 		在字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * 结果：
 * 		java出现了5次
 * 
 * 分析：
 * 		前提：是已经知道了大串和小串。
 * 
 * 		A:定义一个统计变量，初始化值是0
 * 		B:先在大串中查找一次小串第一次出现的位置
 * 			a:索引是-1，说明不存在了，就返回统计变量
 * 			b:索引不是-1，说明存在，统计变量++
 * 		C:把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
 * 		D:回到B
 */
public class StringTest3 {
public static void main(String[] args) {
	String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
	// 定义小串
	String minString = "java";
	int c = getcount(maxString,minString);
	System.out.println("出现了"+c+"次");
	
	
	}
/*
 * 两个明确： 返回值类型：int 参数列表：两个字符串
 */
public static int getcount(String maxString,String minString){
	// 定义一个统计变量，初始化值是0
	int count = 0;
	// 先在大串中查找一次小串第一次出现的位置
//	int s = maxString.indexOf(minString);
//	// 索引不是-1，说明存在，统计变量++
//	while( s!=-1){
//		count++;
//	// 把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
//	int startIndex=	s + minString.length();
//	//返回一个新的字符串，并把该字符串的值重新赋值给大串
//	maxString=maxString.substring(startIndex);
//	// 继续查
//	s=maxString.indexOf(minString); 
//	
//	}return count;
	int s;
	while((s=maxString.indexOf(minString))!=-1){
		count++;
		maxString=maxString.substring(s + minString.length());
	}return count;
}
}
