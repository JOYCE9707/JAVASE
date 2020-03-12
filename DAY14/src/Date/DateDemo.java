package Date;
//Date
import java.util.Date;


public class DateDemo {
public static void main(String[] args) {
    Date D = new Date();
	System.out.println(D);
	System.out.println(D.getTime());
	D.setTime(D.getTime());
	System.out.println(D);
}
}
