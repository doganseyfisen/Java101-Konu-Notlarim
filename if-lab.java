import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sınav Notu (0-100):");
		int score = scanner.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("Harf Notu: AA");
		} else if (score >= 80 && score <= 89) {
			System.out.println("Harf Notu: BA");
		} else if (score >= 70 && score <= 79) {
			System.out.println("Harf Notu: BB");
		} else if (score >= 60 && score <= 69) {
			System.out.println("Harf Notu: CB");
		} else if (score >= 50 && score <= 59) {
			System.out.println("Harf Notu: CC");
		} else if (score >= 40 && score <= 49) {
			System.out.println("Harf Notu: DC (Koşullu geçtiniz.)");
		} else if (score >= 30 && score <= 39) {
			System.out.println("Harf Notu: DD (Koşullu geçtiniz.)");
		} else if (score >= 20 && score <= 29) {
			System.out.println("Harf Notu: FD (Dersten kaldınız.)");
		}  else if (score >= 0 && score <= 19){
			System.out.println("Harf Notu: FF (Dersten kaldınız.)");
		} else {
			System.out.println("Lütfen 0-100 arasında bir değer giriniz!");
		}

	}
}
