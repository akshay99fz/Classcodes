import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		while(n>0)
		{	n=n/10;
			count++;
			if(n==0)
			{
				break;
			}
		}
		System.out.println(count);
	}
}
