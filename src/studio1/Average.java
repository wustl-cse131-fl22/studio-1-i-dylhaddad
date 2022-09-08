package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("The first of two integers to be averaged?");
		int n1 = in.nextInt();
		System.out.print("The next integer?");
		int n2 = in.nextInt();
		double Average = ((n1+n2) / 2.0);
		System.out.print(Average);

	}

}
