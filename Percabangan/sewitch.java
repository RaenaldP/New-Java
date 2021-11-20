import java.util.Scanner;

class sewitch{

	public static void main(String[] args) {
		
		//Membuat varuabel dan Scanner 
		String lampu;
		Scanner userInput = new Scanner(System.in);

		//pengambilan input
		System.out.print("Masukkan warna lampu : ");
		lampu = userInput.nextLine();

		switch(lampu){
			case "merah":
				System.out.println("Lampu merah, berhenti!");
				break;
			case "hijau":
				System.out.println("Lampu hijau, jalan!");
				break;
			case "kuning":
				System.out.println("Lampu kuning, hati-hati!");
				break;
			default:
				System.out.println("Warna yang anda masukkan salah!");
		}
	}
}