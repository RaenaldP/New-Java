class latihan{

	public static void main(String[] args) {
		
		int a = 4;

		boolean benar, salah;
		benar = true;
		salah = false;

		if (a == 5){
			System.out.println("anda benar!");
		} else{
			if (benar == false){
				System.out.println("ternyata salah");
			} else{
				if (a > 5){
					System.out.println("ternyata a lebih besar dari 5");
				} else{
					System.out.println("ternyata a lebih kecil dari 5");
				}
			}

		}

		System.out.println("Selamat!");

	}
}