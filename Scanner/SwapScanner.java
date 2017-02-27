import java.util.Scanner;


public class SwapScanner {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first value");
		int value1 = scanner.nextInt();
		
		System.out.println("Enter your second value");
		int value2 = scanner.nextInt();
		
		value1 = value1 + value2; 
		value2 = value1 - value2; 
		value1 = value1 - value2; 
		
		System.out.println("Value1 is= " + value1);
		System.out.println("Value2 is = " + value2);
		
		scanner.close();
	}

}
