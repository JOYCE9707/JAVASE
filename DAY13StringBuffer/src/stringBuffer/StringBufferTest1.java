package stringBuffer;
/*
 * ������ƴ�ӳ�һ���ַ���
 */
public class StringBufferTest1 {
public static void main(String[] args) {
	
	int arr[]={11,22,33,44,55,66};
	String a =arrayToString(arr);
	System.out.println(a);
	
	
}

public static String arrayToString(int arr[]){
     StringBuffer sb = new StringBuffer();
     sb.append("[");
  for(int x = 0;x<arr.length;x++  ){
	  
	  if(x==arr.length-1){
		  sb.append(arr[x]);
		  
	  }else{
	   sb.append("arr[x]").append(", "); 
	  }
  sb.append("]");

}
return sb.toString();

}


}






