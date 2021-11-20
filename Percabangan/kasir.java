import java.util.Scanner;

class kasir{

	public static void main(String[] args) {
		
		//membuat variabel

		int bayar, belanjaan, diskon;
		String kartu;
		Scanner userInput = new Scanner(System.in);

		//Pengambilan input
		System.out.print("Apakah anda memiliki kartu member? ya/tidak: ");
		kartu = userInput.nextLine();
		System.out.print("Masukkan jumlah belanjaan: ");
		belanjaan = userInput.nextInt();

		if (kartu.equalsIgnoreCase("ya")){
			if (belanjaan >= 500000){
				diskon = 50000;
				System.out.println("Selamat anda mendapatkan diskon Rp."+diskon);
			} else if (belanjaan >= 100000){
				diskon = 15000;
				System.out.println("Selamat anda mendapatkan diskon Rp."+diskon);
			} else{
				diskon = 0;
				System.out.println("Anda tidak mendapatkan diskon.");
			}
		}else{
			if (belanjaan >= 100000){
				diskon = 5000;
				System.out.println("Selamat anda mendapatkan diskon Rp."+diskon);
			} else{
				diskon = 0;
				System.out.println("Anda tidak mendapatkan diskon.");
			}
		}

		bayar = belanjaan - diskon;

		System.out.println("Total belanjaan anda adalah Rp." + bayar);

	}
}