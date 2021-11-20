class main{

	public static void main(String[] args) {
		int a = 0;
		boolean kondisi = true;

		do{
			System.out.println("ini adalah angka yang ke-"+a);
			a++;
			if (a==10){
				kondisi = false;
			}
		} while(kondisi);	

	}
}