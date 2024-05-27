package Com.Jsp.JdbcProject.Module2;

public class KfcFactory {
	public static KfcApp getorder(String type)
	{
		if(type.equalsIgnoreCase("Daining"))
		{
			System.out.println("Daining object is created.....!!");
			return new Daining();
		}
		else if(type.equalsIgnoreCase("Delivary"))
			{
				System.out.println("Delivary object is created.....!!");
				return new Delivary();
			}
		else
		{
			System.out.println("invalid device...!!");
			return null;
		}
	}

}
