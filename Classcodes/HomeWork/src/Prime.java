import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2,flag=0;
		while(i<=Math.sqrt(n))
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			i++;
		}
		if(flag==1)
		{
			System.out.println("Not Prime");
		}
		else
			System.out.println("Prime");
	}
}
