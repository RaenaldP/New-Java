import java.util.Scanner;

class main{

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		int panjang, lebar, luas;

		System.out.println("Menghitung Luas Persegi Panjang\n");

		System.out.print("masukkan panjang: ");
		panjang = userInput.nextInt();
		System.out.print("masukkan lebar: ");
		lebar = userInput.nextInt();
		luas = panjang * lebar;

		System.out.printf("Luas persegi panjang dari panjang %d dan lebar %d adalah %d", panjang, lebar, luas);


	}
}