import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Day of the week: ");
		int day = scanner.nextInt();
		
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday.");
		break;
		case 6:
		case 7:
			System.out.println("Weekend.");
		break;
		}
	}
}
