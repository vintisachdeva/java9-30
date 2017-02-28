
public class IfElse {

	public static void main(String[] args) 
	{
		int value1 = 40;
		int value2 = 200;
		int value3 = 10;
		
		// one-way only if
		
		/*if(value1 > value2)
		{
			System.out.println("Value1 is greater");
		}*/
		
		// another way--> if-else
		
		/*if(value1 > value2)
		{
			System.out.println("Value1 is greater");
		}
		else 
		{
			System.out.println("Value2 is greater");
		}*/

		
		if(value1 > value2 && value1 > value3)
		{
			System.out.println("Value1 is greater");
		}
		else if(value2 > value1 && value2 > value3)
		{
			System.out.println("Value2 is greater");
		}
		else {
			System.out.println("Value3 is greater");
		}
		
		
	}

}
