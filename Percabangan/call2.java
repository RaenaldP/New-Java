import java.util.Scanner;

class call2{

	public static void main(String[] args) {
		
		Scanner userInput;
		float a, b, hasil;
		String operator;

		userInput = new Scanner(System.in);

		System.out.print("Masukkan nilai a: ");
		a = userInput.nextFloat();
		System.out.print("Masukkan operator: ");
		operator = userInput.next();
		System.out.print("Masukkan nilai b: ");
		b = userInput.nextFloat();

		switch(operator){
			case "+":
				hasil = a + b;
				System.out.println("hasil = " + hasil);
				break;
			case "-":
				hasil = a - b;
				System.out.println("hasil = " + hasil);
				break;
			case "*":
				hasil = a * b;
				System.out.println("hasil = " + hasil);
				break;
			case "/":
				hasil = a / b;
				System.out.println("hasil = " + hasil);
				break;
			default:
				System.out.println("Operator " + operator + " tidak ditemukan.");
				break;
		}	

	}
}