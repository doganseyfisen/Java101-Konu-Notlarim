import java.util.Arrays;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 20;
		numbers[3] = 30;
		numbers[4] = 40;
		
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("-----");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
		}*/
		
		//Scanner konsol üzerinde kullanıcadan veri almak için kullanılır
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Dizi Uzunlugu:");
		int length = scanner.nextInt();
		int[] numbers = new int[length];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print((i+1) +". Sayı:");
			numbers[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
		
		//ortalama alma işlemi
		int total = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			total = total + numbers[i];
		}
		System.out.println(total / numbers.length);
		*/
		
//		int total = 0;
//		int[] numbers = {1,5,-5,6,-2,8,9,11};
//		
//		int[] numbers2 = new int[numbers.length];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers2[i] = numbers[i];
//		}
//		
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.toString(numbers2));
		
//		for (int i = 0; i < numbers.length; i++) {
//			total = total + numbers[i];
//		}
//		System.out.println(total);
		
//		String[] names = new String[3];
//		names[0] = "Ali";
//		names[1] = "Veli";
//		names[2] = "Melis";
//		
//		System.out.println(Arrays.toString(names));
//		
//		-1 yazmanın sebebi 3 eleman var ama 3 indeks yok yani names[3] yok 
//		for (int i = names.length - 1; i>=0; i--) {
//			System.out.println(names[i]);
//		}

//		int[] numbers1 = {2,4,6};
//		System.out.println(Arrays.toString(numbers1));
//		int[] numbers2 = numbers1;
//		System.out.println(Arrays.toString(numbers2));
//		
//		numbers1[0]=5;
//		numbers1[1]=1;
//		System.out.println(Arrays.toString(numbers2));

		int[] numbers = {10,7,17,23,24};
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.binarySearch(numbers, 17));//ilk parametre Array (numbers) ikinci aramak istediğin değer (17) yani 2. indeks, 
															//olmayan değer istersen -1 çıkar
		
		int[] copyOf = Arrays.copyOf(numbers,3);
		System.out.println(Arrays.toString(copyOf));
		int[] copyOfRange = Arrays.copyOfRange(numbers,1,4);//1. indeksten 4'e kadar ama 4. dahil değil.
		System.out.println(Arrays.toString(copyOfRange));
		
//		Arrays.fill(numbers, 52);//numbers elemanlarını belirtilen sayıyla doldurur
//		System.out.println(Arrays.toString(numbers));

		Arrays.sort(numbers);//küçükten büyüğe sıralama yaptırmak için
		System.out.println(Arrays.toString(numbers));
	}
}
