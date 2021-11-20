class komprasi{

	public static void main(String[] args) {
		
		// operator komparasi akan mengahasilkan nilai dalam bentuk boolean

		int a,b;
		boolean hasilkomprasi;

		//operator equal
		System.out.println("====Persamaan===");
		a=10;
		b=10;
		hasilkomprasi = (a==b);
		System.out.printf("%d == %d --> %s\n", a,b,hasilkomprasi);

		a=12;
		b=10;
		hasilkomprasi = (a==b);
		System.out.printf("%d == %d --> %s\n", a,b,hasilkomprasi);

		System.out.println("====pertidaksamaan===");
		a=10;
		b=10;
		hasilkomprasi = (a!=b);
		System.out.printf("%d != %d --> %s\n", a,b,hasilkomprasi);

		a=12;
		b=10;
		hasilkomprasi = (a!=b);
		System.out.printf("%d != %d --> %s\n", a,b,hasilkomprasi);

		System.out.println("====kurang dari===");
		a=9;
		b=10;
		hasilkomprasi = (a<b);
		System.out.printf("%d < %d --> %s\n", a,b,hasilkomprasi);

		a=12;
		b=10;
		hasilkomprasi = (a<b);
		System.out.printf("%d < %d --> %s\n", a,b,hasilkomprasi);

		System.out.println("====lebih dari===");
		a=11;
		b=10;
		hasilkomprasi = (a>b);
		System.out.printf("%d > %d --> %s\n", a,b,hasilkomprasi);

		a=12;
		b=10;
		hasilkomprasi = (a>b);
		System.out.printf("%d > %d --> %s\n", a,b,hasilkomprasi);

		System.out.println("====kurang dari equals===");
		a=10;
		b=10;
		hasilkomprasi = (a<=b);
		System.out.printf("%d <= %d --> %s\n", a,b,hasilkomprasi);

		a=12;
		b=10;
		hasilkomprasi = (a<=b);
		System.out.printf("%d <= %d --> %s\n", a,b,hasilkomprasi);

		System.out.println("====lebih dari equals===");
		a=10;
		b=10;
		hasilkomprasi = (a>=b);
		System.out.printf("%d >= %d --> %s\n", a,b,hasilkomprasi);

		a=12;
		b=10;
		hasilkomprasi = (a>=b);
		System.out.printf("%d >= %d --> %s\n", a,b,hasilkomprasi);

		
	}
}