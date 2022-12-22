import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		//Hesap Makinesi
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. sayı: ");
		double number1 = Double.parseDouble(scanner.nextLine());
		System.out.print("2. sayı: ");
		double number2 = Double.parseDouble(scanner.nextLine());
		
		System.out.print("İşlem: ");
		char operation = scanner.nextLine().charAt(0);
		
		
		switch(operation) {
			case '+':
			System.out.println("Sonuç: "+ (number1+number2));
				break;
			case '-':
				System.out.println("Sonuç: "+ (number1-number2));
				break;
			case '*':
				System.out.println("Sonuç: "+ (number1*number2));
				break;
			case '/':
				System.out.println("Sonuç: "+ (number1/number2));
				break;
			default:
				System.out.println("Böyle bir operatör yok.");
				break;
		}
	}
}

//dersteki kod:

/*
Scanner scanner = new Scanner(System.in);
System.out.print("1. sayı: ");
float x = Float.parseFloat(scanner.nextLine());
System.out.print("2. sayı: ");
float y = Float.parseFloat(scanner.nextLine());
System.out.print("İşlem: ");

char islem = scanner.nextLine().charAt(0);

switch(islem) {
	case '+':
	System.out.println("Sonuç: "+ (x+y));
		break;
	case '-':
		System.out.println("Sonuç: "+ (x-y));
		break;
	case '*':
		System.out.println("Sonuç: "+ (x*y));
		break;
	case '/':
		System.out.println("Sonuç: "+ (x/y));
		break;
	default:
		System.out.println("Böyle bir operatör yok.");
		break;
	}
*/
