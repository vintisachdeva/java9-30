import java.util.Scanner;


public class VowelOrConsonant {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a charachter");
		
		char userValue = scanner.next().charAt(0);//next()-- word
		
		switch(userValue)
		{
		
		case 'a':
		case 'A':
			
		case 'e':
		case 'E':
			
		case 'i':
		case 'I':
			
		case 'o':
		case 'O':
			
		case 'u':
		case 'U':
			
			System.out.println("Vowel");
			break;
			
			default:
				System.out.println("Consonant");
				break;
		}
		scanner.close();
	}
}
