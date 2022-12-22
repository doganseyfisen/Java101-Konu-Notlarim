import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int x, y;
		x = 10;
		y = 20;
		/*
		if (x > y) {
			System.out.println("x değeri y değerinden büyüktür");
		} else {
			System.out.println("x değeri y değerinden küçüktür");
		}
		*/
		
		//System.out.println(x > y ? "x değeri y değerinden büyüktür" : "x değeri y değerinden küçüktür");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir değer giriniz: ");
		int i = scanner.nextInt();
		System.out.println(x>i ? "x değeri i değerinden büyüktür" : "x değeri i değerinden küçüktür");
	}
}
