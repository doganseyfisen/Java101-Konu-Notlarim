
public class Driver {

	public static void main(String[] args) {
		/*int x;
		x = 10; 
		float y = 20f;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		System.out.println(8 % 5);//8 in 5 e bölümünden kalan
		
		int a = 11;
		a = a + 2;
		//a+=2 bütünleşik ifade, üstündekiyle aynı
		
		System.out.println(a);
		
		int q = 2;
		System.out.println(q++);
		System.out.println(q);*/
		
		int i = 10; // 00000000 00000000 00000000 00001010 --bellekte yer alan hali
		int x = 4;  // 00000000 00000000 00000000 00000100
					// 00000000 00000000 00000000 00000000
		System.out.println(~i); // 11111111 11111111 11111111 11110101
		System.out.println(i & x); // 0 & 0 = 0
								   // 0 & 1 = 0
		                           // 1 & 0 = 0
		                           // 1 & 1 = 1
	}		

}
