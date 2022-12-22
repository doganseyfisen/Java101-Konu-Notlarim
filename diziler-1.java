import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		/*
		int[] numbers;
		numbers = new int[16];// 16 eleman
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(numbers[5]);
		// ulaşmak istediğim indeks
		
		numbers[5] = 32;
		// 5 numaralı indeksteki elemanı değiştirdik
		System.out.println(numbers[5]);
		*/
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		System.out.println(numbers[7]);
		
		System.out.println(numbers.length);
		
		String[] names = new String[10];
		System.out.println(Arrays.toString(names));
		
		names [3] = "Dogan";
		System.out.println(Arrays.toString(names));
	}

}
