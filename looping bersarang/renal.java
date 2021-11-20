public class renal {

    public static void main(String[] args) {
        System.out.println(" ====Wajik=== ");
        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                if((a+b<4)||(a-b>4)){
                    System.out.print("  ");
                }else if ((b-5==a)||(a+b>12)){
                    break;
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }


        System.out.println("");
        System.out.println("===segitiga===");
        for(int d=0;d<5;d++){
            for (int e=0;e<5;e++){
                if(d - e >0) {
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
}