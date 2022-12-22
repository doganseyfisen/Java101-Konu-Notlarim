import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		//kullanıcıdan veri istemek için yazdık
		System.out.print("Yaşınız: ");
		int yas = scanner.nextInt(); 
		//yas yerine age de yazabilirsin farketmiyor 
		System.out.println(yas >= 18 ? "Ehliyet alabilirsiniz!" : "Ehliyet alamazsınız!"); 
		// -IF BLOKSUZ- 
		//true ise alır, false ise almaz

	}

}
