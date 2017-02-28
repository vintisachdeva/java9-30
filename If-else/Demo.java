
public class Demo {

	public static void main(String[] args) {
		
		String value1 = new String("Hello");
		String value2 = new String("HelLo");
		String value3 = value1;
		String value4 = value2;
		
		System.out.println(value1.equalsIgnoreCase(value2));
		
		System.out.println(value2 == value4);
		

	}

}
