import java.util.*;
class main{

	public static void main(String[] args) {
		
		int userPanjang, userLebar;
		Scanner userInput = new Scanner(System.in);
		//Menginput panjang dan lebar
		System.out.print("Masukkan panjang = ");
		userPanjang = userInput.nextInt();
		System.out.print("Masukkan lebar = ");
		userLebar = userInput.nextInt();
		//Memanggil fungsi
		kotak(userPanjang, userLebar);
		luas(userPanjang, userLebar);
		keliling(userPanjang, userLebar);

		
	}

	public static int luas(int panjang, int lebar){
		int hasil = panjang * lebar;
		System.out.println("Luas = " + hasil);
		return hasil;
	}

	public static int keliling(int panjang, int lebar){
		int hasil = (panjang + lebar) * 2;
		System.out.println("keliling = "+ hasil);
		return hasil;
	}

	public static void kotak(int panjang, int lebar){
		for (int i = 0;i<lebar ;i++ ) {
			for (int j = 0;j<panjang ;j++ ){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}