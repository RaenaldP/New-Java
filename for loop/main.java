class main{

	public static void main(String[] args) {
		
		int a;
		//loop pertama
		for (a =0;a <= 10 ;a++) {
			System.out.println("a adalah nilai ke-"+a);
		}
		System.out.println("\n");
		//loop kedua
		for (a =0;a < 10 ;a++) {
			System.out.println("a adalah nilai ke-"+a);
		}

		System.out.println("\n");
		//loop ketiga
		for (a =10;a > 5 ;a--) {
			System.out.println("a adalah nilai ke-"+a);
		}

		System.out.println("\n");
		//loop keempat
		a =0;
		for (;a < 10 ;) {
			a++;
			System.out.println("a adalah nilai ke-"+a);
		}
	}
}