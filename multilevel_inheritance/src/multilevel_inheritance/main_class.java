package multilevel_inheritance;

public class main_class {
	public static void main(String args[])
	{
		City c1 = new City();
		c1.setCity_name("Ahmedabad");
		c1.setCountry_name("India");
		c1.setState_name("Gujarat");

		System.out.println(c1.toString());
	}
}