import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String userInput = scanner.nextLine();
		//System.out.println(userInput.toLowerCase());
		StringBuffer buffer = new StringBuffer();
		System.out.print("Adınız: "); 
		//print metoduyla yazılan değer aynı satırda
		buffer.append("Ad: ");
		buffer.append(scanner.nextLine());
		System.out.print("Soyadınız: ");
		buffer.append(", Soyad: ");
		buffer.append(scanner.nextLine());
		System.out.println(buffer.toString());
	}

}
