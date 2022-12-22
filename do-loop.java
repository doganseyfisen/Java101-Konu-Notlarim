import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		/*
		int i = 0;
		do {
			System.out.println(i++);
		} while (i < 11);
		*/
		
		//şifre konusu do while'a güzel bir örnektir
		
		String password = null;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Password: ");
			password = scanner.nextLine();
		} while(!password.equals("123")); 
		//yanlış parola girersen yeniden şifre isteyecek, do her halükarda en az 1 defa işler koşul sonra kontrol edilir
		// !password yazmanın sebebi eğer 123 e eşit değilse tekrar do yu tekrarlasın diye	
		
		System.out.println("Welcome...");
		
	}
	
}
