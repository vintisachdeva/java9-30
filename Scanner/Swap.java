
public class Swap {

	public static void main(String[] args) {
		 
		int value1 = 1;
		int value2 = 4;
		
		value1 = value1 + value2;	// 1 + 4 = 5(value1)
		value2 = value1 - value2;	// 5 - 4 = 1(value2)
		value1 = value1 - value2;	// 5 - 1 = 4(value1)

		System.out.println("Value1 is=" + value1 + " Value2 is=" + value2);
		
	}

}
