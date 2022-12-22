import java.time.DayOfWeek;

public class Driver {

	public static void main(String[] args) {
	Aylar ay = Aylar.Ocak;
	System.out.println(ay);
			
	ay = Aylar.Ekim;
	System.out.println(ay); 

	Aylar[] values = Aylar.values();
	for (int i = 0; i < values.length; i++) {
		System.out.println(values[i]);
	}
	Aylar valueOf = Aylar.valueOf("Ekim");
	System.out.println(valueOf);
	
	DayOfWeek saturday = DayOfWeek.SATURDAY;
	System.out.println(saturday);
	
	DayOfWeek of = DayOfWeek.of(5);
	System.out.println(of);
	
	}

}
