import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int A=0;
        int B=0;
        
        Scanner scn = new Scanner(System.in);
        
        A = scn.nextInt();
        B = scn.nextInt();
        
        System.out.print((double)A/B);
    }
}