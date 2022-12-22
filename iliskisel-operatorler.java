import java.util.*;

public class Driver {

	public static void main(String[] args) {
		//boolean sonuc = 5 != 5;
		//System.out.println(sonuc);
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir kelime veya harf giriniz: ");
		String str1 = scanner.nextLine();
		System.out.print("Bir kelime veya harf giriniz: ");
		String str2 = scanner.nextLine();

		System.out.println(str1.equals(str2));
	}

}
