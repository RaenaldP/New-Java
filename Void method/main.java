public class main{

	
	public static void main(String[] args) {

		String halo;	
		main hewan = new main();
		System.out.println(simpel());
		hewan.kucing();

		halo = "ciko";
		hewan.anjing(halo);
	}

	//method dengan void
	//itu maksudnya sebuah method yang bernilai hampa
	//dalam pengembaliannya tidak betuh return

	void kucing(){
		String nama, makanan;
		nama = "cerberus";
		makanan = "whiskas";
		System.out.println("Nama kucing saya "+nama);
		System.out.println("Makanan kucing saya adalah "+makanan);
	}

	void anjing(String name){
		System.out.println("Nama anjing saya adalah "+name);
	}

	//method biasa dengan return
	static float simpel(){
		return 10.0f;
	}
}