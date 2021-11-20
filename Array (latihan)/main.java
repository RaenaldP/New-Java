import java.util.*;

class main{

	public static void main(String[] args) {

		//penjumlahan antara dua buah array
		int[] angkaArray = {2,3,4,2,1,5,3,7,6};
		int[] angkaArray2 ={6,7,9,3,4,1,2,5,9};


		int[] hasil = arrayJumlah(angkaArray, angkaArray2);
		printArray(angkaArray, "Array 1");
		printArray(angkaArray2, "Array 2");
		printArray(hasil, "hasilnya: ");

		System.out.println("\n");

		//Menggabungkan 2 buah array
		int[] hasil2 = new int[angkaArray.length + angkaArray2.length];
		for (int i = 0; i < angkaArray.length ;i++ ) {
		 	hasil2[i] = angkaArray[i];
		 } 

		 for (int i = 0; i < angkaArray.length ;i++ ) {
		 	hasil2[i + angkaArray.length] = angkaArray2[i];
		 } 

		printArray(angkaArray, "Array 1");
		printArray(angkaArray2, "Array 2");
		printArray(hasil2, "hasilnya: ");

		//Membuat array sort kemudian dibalik
		System.out.println("\n");
		printArray(angkaArray, "array 1");
		reverse(angkaArray);
		printArray(angkaArray, "kebalik");
	}

	public static void reverse(int[] dataArray){
		Arrays.sort(dataArray);
		printArray(dataArray, "sort");
		int[] kebalik = Arrays.copyOf(dataArray, dataArray.length);
			for (int i =0; i < dataArray.length ;i++ ) {
				dataArray[i] = kebalik[(dataArray.length -1)- i];
			}
	}

	public static int[] arrayJumlah(int[] arrayInt1, int[] arrayInt2){
		int[] hasilArray = new int[arrayInt1.length];
		for (int i = 0; i < arrayInt1.length ;i++ ) {
			hasilArray[i] = arrayInt1[i] + arrayInt2[i];
		}

		return hasilArray;		
	}



	public static void printArray(int[] dataArray, String meesage){

		System.out.println(meesage +" = "+ Arrays.toString(dataArray));
	}
}