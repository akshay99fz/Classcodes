import java.util.Scanner;

public class OddEven1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result=a%3;
		if(result==0) {
		System.out.println("zero");
		}
		else if(result==1)
		{
			System.out.println("one");
		}
		else
		{
			System.out.println("two");
		}
	}

}
