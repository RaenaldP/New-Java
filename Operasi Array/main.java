import java.util.*;

class main{

	public static void main(String[] args) {
		int [] angkaArray = {1,2,3,4,5};

		System.out.println("\nMengubah array menjadi String\n=============================");
		printArray(angkaArray);

		System.out.println("\nMencopy array dengan loop\n=============================");
		int[] angkaArray2 = new int[5];
		printArray(angkaArray);
		printArray(angkaArray2);
		for (int i = 0;i<5 ;i++ ) {
			angkaArray2[i]=angkaArray[i]; 
		}
		System.out.println("\n");
		printArray(angkaArray);
		System.out.println(angkaArray);
		printArray(angkaArray2);
		System.out.println(angkaArray2);
		
		

		//Ini adalah sebuah cara untuk mecopy isi dari sebuah array 
		//tanpa mengubah lokasi memory dari masing-masing array

		System.out.println("\nMencopy array dengan copyOf\n=============================");
		int[] angkaArray3 = Arrays.copyOf(angkaArray, 5);
		printArray(angkaArray);
		System.out.println(angkaArray);
		printArray(angkaArray3);
		System.out.println(angkaArray3);

		System.out.println("\nMencopy array dengan copyOfRange\n=============================");
		int[] angkaArray4 = Arrays.copyOfRange(angkaArray,2, 4);
		printArray(angkaArray);
		System.out.println(angkaArray);
		printArray(angkaArray4);
		System.out.println(angkaArray4);

		System.out.println("\nMembuat fill array\n=============================");
		int[] angkaArray5 = new int[5];
		printArray(angkaArray5);
		Arrays.fill(angkaArray5, 10);
		printArray(angkaArray5);

		//Mengisi value arrays dengan value berulang
		System.out.println("\nMembuat komparasi array\n=============================");
		int[] angkaArray6 ={1,2,3,9,5};
		int[] angkaArray7 ={1,2,3,4,5};

		System.out.println("Membuat komparasi dari "+Arrays.toString(angkaArray6)+" dan "+Arrays.toString(angkaArray7));
		if(Arrays.equals(angkaArray6, angkaArray7)){
			System.out.println("angka sama");
		}else{
			System.out.println("angka beda");
		}

		System.out.println("\nMengecek arrays mana yang lebih besar\n=============================");
		System.out.println(Arrays.compare(angkaArray6, angkaArray7));
		//Jika output yang keluar adalah satu maka angkaArray6 lebih besar
		//jika yang keluar adalah -1 maka angkaArray7 yang lebih besar
		//jika yang keluar adalah angka 0 maka keduanya sama

		System.out.println("\nMengecek index mana yang berbeda\n=============================");
		System.out.println(Arrays.mismatch(angkaArray6, angkaArray7));

		System.out.println("\nsort array\n=============================");
		int[] angkaArray8 = {7,6,8,9,10,4,2,1};
		printArray(angkaArray8);
		Arrays.sort(angkaArray8);
		printArray(angkaArray8);

		System.out.println("\nsearch array\n=============================");
		int index = 9;
		int cek = Arrays.binarySearch(angkaArray8,index);
		System.out.println("angka "+index+" ada di index "+cek);		




	}

	public static void printArray(int[] dataArray){

		System.out.println("array = "+ Arrays.toString(dataArray));
	}
}