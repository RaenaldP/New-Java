import java.util.Scanner;

class main{

	public static void main(String[] args) {
		
		//Ini adalah program pengelompokkan aritmatika
		//pada dasarnya pengelompokkan ini terjadi sama dengan aritmatika pada umumnya
		System.out.println(5*6+10); //perkalian duluan
		System.out.println(10/5+20);
		System.out.println(10/5+5*6);
		System.out.println(10/(5+5)*6); //Jika ingin penjumlahan/pengurangan duluan maka tinggal dikelompokkan saja
		System.out.println("\n");

		//kita coba dengan membuat sebuah program user input persamaan kuadrat
		Scanner userInput = new Scanner(System.in);

		int a,b,c,d;
		System.out.print("nilai a: ");
		a = userInput.nextInt();
		System.out.print("gradient b: ");
		b = userInput.nextInt();
		System.out.print("bias c: ");
		c = userInput.nextInt();

		d= (a * b * b) + c;
		System.out.printf("Hasil Perasamaan kuadrat dari nilai %d,%d dan %d adalah %d", a, b, c, d);



	}
}