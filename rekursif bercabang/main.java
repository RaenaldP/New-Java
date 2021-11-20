import java.util.*;

class main{

	public static void main(String[] args) {
		
		int nilai;
		Scanner userInput = new Scanner(System.in);

		System.out.print("Masukkan jumlah fibonacci: ");
		nilai = userInput.nextInt();
		int jumlah = nilaiFibonacci(nilai, "atas");
		System.out.println("Nilai fibonaccinya adalah: "+ jumlah);
	}

	public static int nilaiFibonacci(int n, String daun){
		System.out.println("daun "+daun);
		System.out.println("Fibonacci ke-"+n+"\n");

		if (n == 1 || n == 0) {
			return n;
		}else{
			return nilaiFibonacci(n-1, "kiri") + nilaiFibonacci(n-2, "kanan");	
		}

		
	}

}