import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		
		//Arrays-------------------------------------------------
		
		/*
		String[] myStringArray = new String [6];
		myStringArray [0] = "Till";
		myStringArray [1] = "Richard";
		myStringArray [2] = "Paul";
		myStringArray [3] = "Oliver";
		myStringArray [4] = "Flake";
		myStringArray [5] = "Christoph";
		
		System.out.println(myStringArray [4]);
		*/
		
		/*
		int[] numbers = {11, 12, 13, 14};
		System.out.println(numbers[0]);
		*/
		
		//Lists-------------------------------------------------
		
		/*
		ArrayList<String> rammsteinMembers = new ArrayList <>();
		rammsteinMembers.add("Till");
		rammsteinMembers.add("Richard");
		rammsteinMembers.add("Paul");
		rammsteinMembers.add(0, "Flake");
		
		System.out.println(rammsteinMembers.get(0));
		System.out.println(rammsteinMembers.size());
		*/
		
		//Set-------------------------------------------------
		
		/*
		HashSet<String> mySet = new HashSet<>();
		mySet.add("Till");
		System.out.println(mySet.size());
		*/
		
		//HashMap-------------------------------------------------
		
		/*
		HashMap<String, String> myHashMap = new HashMap<String, String>();
		
		myHashMap.put("name", "Till Lindemann");
		myHashMap.put("nationality", "German");
		
		System.out.println(myHashMap.get("name"));
		System.out.println(myHashMap.get("nationality"));
		*/
		
		/*
		HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
		
		myHashMap.put("year", 1914);
		myHashMap.put("population", 500000);
		
		System.out.println(myHashMap.get("year"));
		System.out.println(myHashMap.get("population"));
		*/
		
		//Statements-------------------------------------------------
		
		/*
		for (int x = 5; x <= 6; x++) {
			System.out.println(x);
		}
		*/
		
		/*
		float a = 5.1f;
		float b = 5.2f;
			System.out.println(a>b);
			System.out.println(b==a);
		*/	
		
		//and && iki taraftan biri false ise sonuç false çıkar-------------------------------------------------
		//or || iki taraftan biri true ise sonuç true çıkar-------------------------------------------------
		
		/*
		int x, y, z;
		x = 3;
		y = 4;
		z = 5;
		
		System.out.println(x>y && y<z); //false-true olunca false
		System.out.println(x<y && y<z); //true-true olunca true
		System.out.println(x>y && y>z);	//false-false olunca da false
		System.out.println(y<z && x>y); //true-false olunca da false
		*/
		
		//if statements-------------------------------------------------
		
		/*
		int x = 11;
		int	y = 11;
		if (x < y) {
			System.out.println("y is bigger than x.");
		} else if (y < x){
			System.out.println("y is less than x.");
		} else {
			System.out.println("y equals to x.");
		}
		*/
		
		//switch-------------------------------------------------
		
		/*
		int day = 2;
		String dayString = "";
		*/
		
		/*
		if(day == 1) {
			dayString = "Monday";
		} else if (day == 2) {
			dayString = "Tuesday";
		} else if (day == 3) {
			dayString = "Wednesday";
		} else {
			dayString = "Thursday";
		}
		*/
		
		/*
		switch (day) {
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			case 3:
				dayString = "Wednesday";
				break;
			default:
				dayString = "Thursday";
		}
		System.out.println(dayString);
		}
		*/
		
		//Loops-------------------------------------------------
		
		//for loop***genelde dizilerle kullanılır
		
		/*
		int[] myNumbers = {22, 10, 16, 6, 24};
		
		//System.out.println(x);
		
		for (int i = 0; i < myNumbers.length; i++ ) {
			
			int x = myNumbers[i] / 2 * 5;
			
			//System.out.println(x);
		}
		
		for (int number : myNumbers) {
			
			//System.out.println(number / 2 * 5);
		}
		
		for (int a = 0; a < 10; a++) {
			
			int b = a * 2;
			
			System.out.println(b);
		}
		*/
		
		//while loop***for ile aynı işlevi var, bazı yönlerden daha pratik
		
		/*
		int c = 0;
		
		while (c < 10) {
			int m = c * 2;
			System.out.println(m);
			
			c++;
		*/	
		}
	}
