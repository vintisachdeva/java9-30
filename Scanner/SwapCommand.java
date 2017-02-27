
public class SwapCommand {

	public static void main(String[] args) 
	{
		//command line argument 
		//System.out.println("Enter your first value");
		int value1 = Integer.parseInt(args[0]);	// 15
		
		//System.out.println("Enter your second value");
		int value2 = Integer.parseInt(args[1]);	// 20
		
		value1 = value1 + value2; // 5 + 10 = 15(value1)
		value2 = value1 - value2; // 15 - 10 = 5(value2)
		value1 = value1 - value2; // 15 - 5 = 10 (value1)
		
		System.out.println("Value1 is=" + value1);
		System.out.println("Value2 is = " + value2);
	}
}
