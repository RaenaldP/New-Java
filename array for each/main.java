class main{

	public static void main(String[] args) {
		
		int AngkaArray[] = {12, 5, 34, 6,35 ,89, 77, 2};

		System.out.println("Perulangan biasa");
		for (int i = 0;i < 8 ; i++ ) {
			System.out.println("ini adalah angka ke-"+ AngkaArray[i]);
		}
		System.out.println("\n");
		System.out.println("perulangan for each");
		for (int angka : AngkaArray){
			System.out.println("ini adalah angka ke-"+ angka);
		}
		System.out.println("\n");
		System.out.println("perulangan dengan length");
		for (int i= 0;i < AngkaArray.length ;i++ ) {
			System.out.println("ini adalah angka ke-"+ AngkaArray[i]);
		}
	}
}