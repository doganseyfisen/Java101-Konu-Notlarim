import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		//üçgen
		/*
		int i = 1; 
		int starCount = scanner.nextInt();
		while(i <= starCount) {
			int j = 0;
			while(j<i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		
		/*
		long total = 0;
		while(true) {
			int x = scanner.nextInt();
			if(x == 0) {
				break;
			}
			total += x; // x 0 olana kadar girilen değerlerin toplamını veriyor
		}
		System.out.println(total);
		*/
		
		/*
		//0 dan 100 e kadar olan çift sayıları yazdırma programı
		int x = 0; 
		int y = 100;
		while(x<y) {
			if(x%2 == 0) {
				System.out.println(x);
			}
			x++;
		}
		*/
		
		//min ve max sayıyı ekrana yazdırma
		/*
		int x = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while(x < 10) {
			int input = scanner.nextInt();
			if(input<min) min = input;
			if(input>max)max = input;
			x++;
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		*/
		
		//girilen değerleri sıfır girilinceye kadar olan halleriyle ortalama alma
		/*
		float average = 0;
		int count = 0;
		while(true) {
			int number = scanner.nextInt();
				if(number == 0) break;
				count++;
				average += number;
		}
		System.out.println(average / count);
		*/
		
		//kaç + kaç - sayı var programı
		/*
		int positiveCount = 0;
		int negativeCount = 0;
		
		while(true) {
			int x = scanner.nextInt();
			if (x > 0) {
				positiveCount++;
			} else if (x < 0) {
				negativeCount++;
			} else {
				break;
			}
		}
		
		System.out.println("Pos: "+positiveCount);
		System.out.println("Neg: "+negativeCount);
		*/
		
	}
}
