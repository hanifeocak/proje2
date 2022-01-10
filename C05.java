package day08;

import java.util.Arrays;

public class C05 {

	public static void main(String[] args) {
	/*
		SORU 5
		/*Write a return method that accepts 2 integer Arrays as 
		parameters And adds 2
		array into a new Array and prints it.
		Input1={1,2,3,4} 
		Input2={5,6}
        Output={1,2,3,4,5,6};

*2 tamsayı Dizisini kabul eden bir dönüş yöntemi yaz
parametreler Ve 2 ekler
diziyi yeni bir Diziye dönüştürür ve yazdırır.
Girdi1={1,2,3,4}
Giriş2={5,6}
        Çıktı={1,2,3,4,5,6};
*/
  int arr1[]= {1,2,3,4};
  int arr2[]= {5,6};
	int birlesikArray[]=birlestir(arr1,arr2);	
	
	System.out.println(Arrays.toString(birlesikArray));//[1, 2, 3, 4, 5, 6]
	
	
	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		int birlesikArray[]=Arrays.copyOf(arr1, arr1.length+arr2.length);//[1,2,3,4,0,0]
		for (int i = 0; i < arr2.length; i++) {
			birlesikArray[arr1.length+i]=arr2[i];
		}
		
		
		
		return birlesikArray;

	
	}	
		
}		
		
		
		
		
		
		
		
		
		
	