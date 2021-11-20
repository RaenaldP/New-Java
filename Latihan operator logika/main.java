import java.util.*;

class main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nilaiBenar = 6;
		int nilaiTebakan;
		boolean statusTebakan;
		System.out.println("\n");
		System.out.print("Masukkan nilai tebakan anda: ");
		nilaiTebakan = input.nextInt();
		System.out.println("Nilai Tebakan anda adalah "+nilaiTebakan);
		System.out.println("\n");
		statusTebakan = (nilaiTebakan == nilaiBenar);
		System.out.println("Tebakan anda "+statusTebakan);
		System.out.println("\n");
		//logika bitwise
		System.out.print("Masukkan nilai tebakan anda (antara 4 & 9): ");
		nilaiTebakan = input.nextInt();
		System.out.println("\n");
		statusTebakan = (nilaiTebakan>4) && (nilaiTebakan<9);
		System.out.println("Tebakan anda "+statusTebakan);


	}
}