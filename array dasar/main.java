import java.util.Arrays;

class main{

	public static void main(String[] args) {
		

		//assignment
		// tipedata [] nama_array = { }
		int[] angkaArray = {1,2,3,4};

		angkaArray[0] = 69;

		System.out.println(angkaArray[0]);
		System.out.println(angkaArray[1]);
		System.out.println(angkaArray[2]);
		System.out.println(angkaArray[3]);

		//deklarasi
		// tipedata[] nama_array = new tipedata[]
		float[] arrayFloat = new float[10];

		System.out.println("\n");
		arrayFloat[0] = 1;
		arrayFloat[1] = 2;
		arrayFloat[2] = 44;
		arrayFloat[3] = 4;
		arrayFloat[4] = 5;
		arrayFloat[5] = 6;
		arrayFloat[6] = 7;
		arrayFloat[7] = 8;
		arrayFloat[8] = 9;
		arrayFloat[9] = 10;

		System.out.println(arrayFloat[0]);
		System.out.println(arrayFloat[1]);
		System.out.println(arrayFloat[2]);
		System.out.println(arrayFloat[3]);
		System.out.println(arrayFloat[4]);
		System.out.println(arrayFloat[5]);
		System.out.println(arrayFloat[6]);
		System.out.println(arrayFloat[7]);
		System.out.println(arrayFloat[8]);
		System.out.println(arrayFloat[9]);

		System.out.println("");

		//sebuah pemanggilan fungsi luar kelas untuk mengubah array menjadi string dan di print ke arah samping
		System.out.println(Arrays.toString(angkaArray));
		System.out.println(Arrays.toString(arrayFloat));

	}
}