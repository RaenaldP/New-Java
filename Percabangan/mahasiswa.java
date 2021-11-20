import java.util.Scanner;

class mahasiswa{
	public static void main(String[] args) {
		
		int nilai;
		String nama;
		Scanner userInput = new Scanner(System.in);

		System.out.print("masukkan nama :");
		nama = userInput.nextLine();
		System.out.print("Masukkan nilai: ");
		nilai = userInput.nextInt();

		if(nilai >= 70) {
			System.out.println("mahasiswa dengan nama " + nama + " dinyatakan lulus");
		} else{
			System.out.println("mahasiswa dengan nama " + nama + " tidak lulus");
		}
	}
}