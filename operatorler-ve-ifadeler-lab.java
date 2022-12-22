import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		/*
		int x;
		x = 7;
		//x++;
		//x = x + 1;
		System.out.println(x++);
		System.out.println(x);
		
		System.out.println(--x);
		
		System.out.println(5%2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz: ");
		int a = scanner.nextInt();
		System.out.println(a%2 == 0 ? "Çift sayı" : "Tek sayı");
		*/
		
		//PAROLA UYGULAMASI
		Scanner scanner = new Scanner(System.in);
		System.out.print("Parolanızı giriniz: ");
		String password = scanner.next();
		boolean isOk = password.equals("1998");
		System.out.println(isOk ? "Parolanız doğru!" : "Hatalı parola!");
	}
}
