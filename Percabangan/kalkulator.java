import java.util.*;

class kalkulator{

	public static void main(String[] args) {
		
		Scanner userInput =  new Scanner(System.in);
		float a,b,hasil;
		char operator;

		System.out.print("masukkan nilai a: ");
		a = userInput.nextFloat();
		System.out.print("masukkan nilai oeprator: ");
		operator = userInput.next().charAt(0);
		System.out.print("masukkan nilai b: ");
		b = userInput.nextFloat();

		System.out.println("angka yang dimasukkan " + a + " " + operator + " " + b );

		if(operator == '+'){
			hasil = a+b;
			System.out.println("Hasil  = " + hasil);
		}else if(operator == '-'){
			hasil = a-b;
			System.out.println("Hasil  = " + hasil);
		}else if(operator == '*'){
			hasil = a*b;
			System.out.println("Hasil  = " + hasil);
		}else if(operator == '/'){
			if(b == 0){
				System.out.println("pembagian tidak bisa dibagi dengan 0");
			}else{
				hasil = a/b;
				System.out.println("Hasil  = " + hasil);
			}
			
		}else{
			System.out.println("Operator tidak ditemukan.");
		}



	}
}