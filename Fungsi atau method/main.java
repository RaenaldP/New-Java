import java.util.*;

public class main{

	public static void main(String[] args) {
		int x,y;
		char confirm;
		boolean kondisi;
		Scanner input = new Scanner(System.in);
		kondisi = true; 
		while(kondisi == true){
			if(kondisi = true){
				System.out.print("Masukkan nilai x: ");
				x=input.nextInt();
				y= hitung(x);
				System.out.println("x = "+x+" y = "+y);
				System.out.print("apakah anda ingin lanjut? [y/n] ");
				confirm = input.next().charAt(0);
				System.out.println("\n");
				if (confirm == 'y'){
					kondisi = true;
				} else{
					kondisi = false;
					System.out.println("Program berakhir");
					break;
				}
			}
			
		}
	}

	static int hitung(int input){
		int hasil;
		hasil = (input*2) +input;

		return hasil;
	}
}