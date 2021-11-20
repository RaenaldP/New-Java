class file1{

	public static void main(String[] args) {
		int nilaiInt = 450; //32bit
		System.out.println("Nilai Int = " + nilaiInt);

		long nilaiLong = nilaiInt;
		System.out.println("Nilai long = " +nilaiLong);

		byte nilaiByte = (byte) nilaiInt;
		System.out.println("Nilai byte = "+ nilaiByte);
		System.out.println("Nilai Max Byte = "+ Byte.MAX_VALUE);
		System.out.println("Nilai Min Byte = "+ Byte.MIN_VALUE);

		//Casting pembagian
		float a= 10;
		int b= 4;

		float c = a/b;

		System.out.printf("%f / %d = %f\n", a, b, c);

		//Casting lanjutan

		int x = 10;
		int y = 4;
		float z = (float)x/y;

		System.out.printf("%d / %d = %f", x, y,z);
	}
}