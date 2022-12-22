import static java.lang.Math.PI; 
//bunu yazmasaydım eğer sysout(Math.PI) şeklinde

public class Driver {

	static int i; 
	//static methodlar sadece static degiskenlere erişir, 
	//burada i static değil (başa static getir)
	static {
		//System.out.println("Static block");
		//i = 23; 
	}
	
	public static void main(String[] args) { 
		//main static methoddur
		//veya;
		//Driver driver = new Driver();
		//driver.i = 20;
		//System.out.println(i); 

		System.out.println(PI);
	}

}
