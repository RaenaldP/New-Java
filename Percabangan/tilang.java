import java.util.Scanner;

class tilang{

	public static void main(String[] args) {
		
		boolean SIM, STNK;
		Scanner userInput = new Scanner(System.in)
		String tanya1, tanya2;
		SIM = false;
		STNK = true;

		System.out.print("Apakah anda memiliki SIM? ");
		tanya1 = userInput.nextLine();
		System.out.print("Apakah anda memiliki STNK? ");
		tanya2 = userInput.nextLine();

		if (tanya1.equalsIgnoreCase("ada")){
			else if (tanya2.equalsIgnoreCase("ada")){
				System.out.println("anda tidak di tilang");
			}
		}

	}
}