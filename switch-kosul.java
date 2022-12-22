import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		//scanner nesnedir
		System.out.print("Which day of week do you want to learn? Enter number:");
		int day = scanner.nextInt();
		String dayString = ""; 
		
		switch (day) {
		case 1:
			//iki nokta üst üsteye dikkat et
			dayString = "Monday";
			break;
			
		/*
		-------veya şu şekilde yazılabilirdi, başta String'e gerek kalmazdı.
		case 1:
		System.out.println(Monday);
		break;	
		*/
			
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;	
		case 6:
			dayString = "Saturday";
			break;
		case 7:
			dayString = "Sunday";
			break;
		default:
			System.out.println("1 ile 7 arasında bir sayı girmelisiniz.");
		}
		System.out.println(dayString);
	}
}
