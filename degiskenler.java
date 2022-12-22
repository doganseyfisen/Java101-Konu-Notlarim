
public class Driver {
	
	public static void main(String[] args) {
		byte b;
		b = 10; 
		//1 Byte yer kaplar
		System.out.println(b);
		short s = 20; //2 Byte
		System.out.println(s);
		int i = 30; //4 Byte
		System.out.println(i);
		long l = 40; //8 Byte
		System.out.println(l);
		
		float pi = 3.14f; //4 Byte
		System.out.println(pi);
		
		double d = 23.123456; //8 Byte
		System.out.println(d);
		
		//Tek tırnak arasında harf olmalı, 2 Byte
		char c = 'a'; 
		System.out.println(c);
		
		boolean bool = true; //1 Byte
		System.out.println(bool);
	}
}
