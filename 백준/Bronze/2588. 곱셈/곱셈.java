import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a, b;
		a = scn.nextInt();
		b = scn.nextInt();
		
		int last = a*b;
		
		int three, four, five;
		
		five = a * (b/100);
		b = b-(b/100)*100;
		four = a * (b/10);
		b = b - (b/10)*10;
		three = a*b;
		
		System.out.print(three + "\n" + four + "\n" + five + "\n" + last);
		
	}
}