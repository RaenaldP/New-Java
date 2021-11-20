class main{

	public static void main(String[] args) {
		printAngka(23);
		printAngka(66.9f);
		printAngka(24.4d);
		int hasil = tambah(5,6);
		printAngka(hasil);

		float pecah = tambah(5.4f,6.5f);
		printAngka(pecah);

	}
	public static float tambah(float a, float b){
		return a + b;
	}

	public static int tambah(int a, int b){
		return a + b;
	}

	public static void printAngka(int angka){
		System.out.println("Ini adalah angka integer : " + angka);
	}

	public static void printAngka(float angka){
		System.out.println("Ini adalah angka float : "+ angka);
	}

	public static void printAngka(double angka){
		System.out.println("Ini adalah angka double : "+ angka);
	}
}