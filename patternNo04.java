public class patternNo04 {
    public static void main(String args[]) {
        int n= 4;
        int count = 1;
        for(int i= n; i>0 ; i--) {
            for (int j=0; j<i-1; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=count; k++) {
                System.out.print("*");
            }
            count++;
            System.out.println();
        }
    }
}