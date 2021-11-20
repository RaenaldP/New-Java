class unrey{

	public static void main(String[] args) {
		
		int a= 10;
		int b= 4;

		System.out.println(-a);
		System.out.println(+b);

		//decrement & Increment
		int x = 5;
		int y = 10;
		++x;
		y--;
		System.out.println("Ini adalah sistem decrement and increment dengan sistem '++' = " + x);
		System.out.println("Ini adalah sistem decrement and increment dengan sistem '--' = " + y);

		//Prefix dan postfix
		int t = 6;
		int u = 11;
		System.out.printf("Ini adalah sistem prefix = %d\n", ++t);
		System.out.printf("Ini adalah sistem postfix = %d\n", u++);
		System.out.printf("Ini adalah sistem postfix = %d\n", u);
		
		//boolean unary
		boolean ucup = true;

		System.out.println("nilai boolean = " + ucup);
		System.out.println("nilai boolean = " + !ucup);


	}
}