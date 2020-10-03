import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result=a%2;
		if(result==0) {
		System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
