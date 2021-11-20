class main{

	public static void main(String[] args) {
		
		byte a = 3, b,c;
		String a_bits, b_bits, c_bits;

		//SHIFT LEFT <<
		System.out.println("=========== SHIFT LEFT");
		a_bits = String.format("%8s",Integer.toBinaryString(a));
		b = (byte)(a << 2);
		b_bits = String.format("%8s",Integer.toBinaryString(b));
		System.out.printf("%s = %d \n", b_bits, b);

		//SHIFT RIGHT >>
		System.out.println("=========== SHIFT RIGHT");
		a=24;
		a_bits = String.format("%8s",Integer.toBinaryString(a));
		b = (byte)(a >> 1);
		b_bits = String.format("%8s",Integer.toBinaryString(b));
		System.out.printf("%s = %d \n", b_bits, b);

		//Operator bitwise
		System.out.println("=========================");
		a=24;
		a_bits = String.format("%8s",Integer.toBinaryString(a));
		System.out.printf("%s = %d \n", a_bits, a);
		b = 12;
		b_bits = String.format("%8s",Integer.toBinaryString(b));
		System.out.printf("%s = %d \n", b_bits, b);
		System.out.println("================================OR");
		c = (byte)(a & b);
		c_bits = String.format("%8s",Integer.toBinaryString(c));
		System.out.printf("%s = %d \n", c_bits, c);
	}
}