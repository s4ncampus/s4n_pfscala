import java.util.Scanner;

public class Gcd2 {
    public static int gcd(int a, int b) {
	while (a != b)
	    if (a > b)
		a = a - b;
	    else
		b = b - a;
	return a;
    }

    public static void main(String []args) {
	System.out.print("Enter three integer values separated by spaces: ");
	System.out.flush();

	Scanner scan = new Scanner(System.in);

	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();

	System.out.println("The minimun size to cut is: " +
			   gcd(gcd(a, b), c));
    }
}
