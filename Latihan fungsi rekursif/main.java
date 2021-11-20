// I will try rekursif

import java.util.*;

class main{

	public static void main(String[] args) {
		
		int nilai;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Masukkan nilai : ");
		nilai = userInput.nextInt();

		printNilai(nilai);
		int jumlah = hitung(nilai);
		System.out.println("Jumlah =" + jumlah);
		int kali = faktorial(nilai);
		System.out.println("Perkalian =" + kali);

	}

	public static int faktorial( int parameter){

		System.out.println("parameter =" + parameter);

		if( parameter == 1){
			return parameter;
		}

		return parameter * faktorial(parameter -1);
	}

	public static int hitung( int parameter){

		System.out.println("parameter =" + parameter);

		if( parameter == 0){
			return parameter;
		}

		return parameter + hitung(parameter -1);
	}

	public static void printNilai(int parameter){

		System.out.println("nilai = "+ parameter);

		if (parameter == 0) {
			return;
		}

		parameter--;

		printNilai(parameter);
	}
}