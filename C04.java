package day08;

public class C04 {

	public static void main(String[] args) {
		/*
		 * SORU 2 /*verilen bir int Arrayde toplamlari istenen degere esit olan sayi
		 * çiftlerini yazdiran bir method yaziniz int[] arr= {5,7,- 6,4,2,15,3,8,1}; int
		 * istenenToplam=9;
		 */

		int[] arr = { 5, 7, -6, 4, 2, 15, 3, 8, 1 };
		toplam(arr);

	}

	private static void toplam(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 9) {
					System.out.println(arr[i] + "+" + arr[j]);
				}

			}
		}
	}
}
