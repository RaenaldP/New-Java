import java.util.*;

class main{

	public static void main(String[] args) {
		
		int fn1, fn2, fn, n, i;
		i=0;
		Scanner input = new Scanner(System.in);
		fn1 =1;
		fn2 =0;
		fn=1;

		System.out.print("Masukkan deret: ");
		n = input.nextInt();

			while(i<n){
			System.out.println("Deret 1pertama "+i+" adalah "+fn);
			i++;
			fn = fn1 + fn2;
			fn2 = fn1;
			fn1 = fn;
			 
		}


		do{
			System.out.println("Deret 2pertama "+i+" adalah "+fn);
			i++;
			fn = fn1 + fn2;
			fn2 = fn1;
			fn1 = fn;
		}while(i<n);


	}
}