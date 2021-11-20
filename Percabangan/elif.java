import java.util.Scanner;

class elif{

	public static void main(String[] args) {
		
		int nilai;
		String grade;
		Scanner userInput = new Scanner(System.in);

		System.out.print("Masukkan nilai anda: ");
		nilai = userInput.nextInt();

		if (nilai >= 90){
			grade = "A";
		} else if (nilai >= 80){
			grade = "B";
		} else if (nilai >= 70){
			grade = "C";
		} else if (nilai >= 50){
			grade = "D";
		} else{
			grade = "E";
		}

		System.out.println("Grade nilai anda adalah " + grade);
	}
}