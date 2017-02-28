
public class ReferenceType {

	public static void main(String[] args) {

		String value1 = new String("Hello");
		String value2 = new String("hello");
		
		
		System.out.println("Result is=" + (value1.equalsIgnoreCase(value2)));
		//System.out.println("Result is=" + (value1.equals(value2)));
		
		
		/*Integer value1 = new Integer(100);
		Integer value2 = new Integer(100);
		
		System.out.println(value1.equals(value2));
		// 100 == 100 --> equals
		// address check
		*/
		
	}

}
