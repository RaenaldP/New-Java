import java.util.*;

class main{

	public static void main(String[] args) {
		int[] AngkaArray = {2,5,4,3,67,7};
		int[] AngkaArray2 = new int[6];

		System.out.println(AngkaArray);
		System.out.println(AngkaArray2);

		AngkaArray2 = AngkaArray;
		System.out.println("\n");

		System.out.println(AngkaArray);
		System.out.println(AngkaArray2);

		System.out.println(Arrays.toString(AngkaArray));
		System.out.println(Arrays.toString(AngkaArray2));

		AngkaArray[0] = 400;

		System.out.println("\n");

		System.out.println(Arrays.toString(AngkaArray));
		System.out.println(Arrays.toString(AngkaArray2));

		System.out.println("\n");
		arrayku(AngkaArray);

		System.out.println(Arrays.toString(AngkaArray));
		System.out.println(Arrays.toString(AngkaArray2));


		System.out.println("\n");
		
		System.out.println(AngkaArray);
		System.out.println(AngkaArray2);

	}

	public static void arrayku(int[] myarray){

			myarray[4] = 600; 
		}
}

//Pada praktik ini kita dapat menegetahui bahwa keadaan memory dalam array ketika di pass maka akan dalam keadaan yang sama
//oleh karena itu perlu untuk programer dalam berhati-hati menggunakan array dengan sistem memorynya