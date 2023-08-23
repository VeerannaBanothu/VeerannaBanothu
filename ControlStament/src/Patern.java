import java.util.Scanner;
public class Patern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(a+" "+b);
		while(c<n)
		{
			c=a+b;
			if(c>=n)
			break;
			System.out.println(" "+c);
			a=b;
			b=c;
		}

	}

}
