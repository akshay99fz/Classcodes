import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double feh = sc.nextDouble();
		double cel=(feh-32)*(double)5/9;
		System.out.println(cel);
	}
}
