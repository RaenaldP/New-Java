import java.util.Scanner;

class main{

	public static void main(String[] args) {
		
		int hadiah = 0;
		Scanner userInput = new Scanner(System.in); 

		System.out.print("Masukkan jumlah perbelanjaan: ");
		hadiah = userInput.nextInt();

		if(hadiah > 100000){
			System.out.println("Selamat anda mendapatkan diskon");

			
		}

	}
}