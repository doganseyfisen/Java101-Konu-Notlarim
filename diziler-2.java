import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		/*
		int[][] numbers = new int[2][3];
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		numbers[0][2] = 3;
		
		numbers[1][0] = 4;
		numbers[1][1] = 5;
		numbers[1][2] = 6;
		
		System.out.println(Arrays.toString(numbers));
		
		for (int i = 0;i <2;i++) {
			for (int j = 0; j <3;j++) {
				System.out.println(numbers[i][j]);
				}
			}
		}
		*/
		String[][] ogrenciler = new String [3][3];
		ogrenciler[0][0] = "Metin";
		ogrenciler[0][1] = "Melda";
		ogrenciler[0][2] = "Merve";
		
		ogrenciler[1][0] = "Koray";
		ogrenciler[1][1] = "Seda";
		ogrenciler[1][2] = "Metehan";

		ogrenciler[2][0] = "Volkan";
		ogrenciler[2][1] = "Aslı";
		ogrenciler[2][2] = "Burhan";
		
		for (int i = 0; i < ogrenciler.length;i++) {
			for (int j = 0; j< ogrenciler[i].length;j++) {
				System.out.print(i + " "+ j+":");
				System.out.println(ogrenciler[i][j]);
			}
		}
		}
}
