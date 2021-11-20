class main{

	public static void main(String[] args) {
		
		int awal, akhir, total;
		awal = 0;
		akhir = 10;
		total =0;
		boolean kondisi = true;

		//versi pertama

		while(kondisi){
			awal++;
			total = total + awal;
			System.out.printf("nilai total %d,\nnilai awal %d\n",total,awal);

			if (awal >= akhir) {
				kondisi =false;
			}
		}

		//versi kedua
		while(awal <= akhir){
			
			total = total + awal;
			awal++;
			System.out.printf("nilai total %d,\nnilai awal %d\n",total,awal);
		}
	}
}