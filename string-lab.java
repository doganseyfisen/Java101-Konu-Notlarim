import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));
		str2 = "HeLLo";
		System.out.println(str1.equalsIgnoreCase(str2));
		//Ignore büyük küçük harf duyarlılığı olmadan çalışır
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please write a word: ");
		String line = scanner.nextLine();
		System.out.println(line.toLowerCase());
		System.out.println(line.toUpperCase());
		System.out.println(line.charAt(2));
		
		System.out.println(line.length());
		System.out.println(line.substring(4));
		System.out.println(line.replace("er", "ge"));
		
		System.out.println(line.indexOf('e'));
		System.out.println(line.lastIndexOf('e'));
		*/
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		System.out.println(str1 + " " + str2);

	}

}
