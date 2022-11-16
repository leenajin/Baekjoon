import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a, b;
		a = scn.nextInt();
		b = scn.nextInt();
		
		int three = a*((b%100)%10);
		int four = a*((b%100)/10);
		int five = a*(b/100);
		
		System.out.print(three + "\n" + four + 
				"\n" + five + "\n" + a*b);
	}
}