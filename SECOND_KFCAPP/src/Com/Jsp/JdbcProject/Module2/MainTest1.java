package Com.Jsp.JdbcProject.Module2;
 import java.util.*;
public class MainTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the type of order you want ");
		String choice=sc.next();
		KfcApp order=KfcFactory.getorder(choice);
		if(order!=null)
		{
			order.payment();
			order.quantity();
		}

	}

}
