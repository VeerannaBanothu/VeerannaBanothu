import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("prime numbers from 1 to 100 are:");
		int i=0;
		int num=0;
		String primenumbers=" ";
		for(i=1;i<=100;i++)
		{
			int count=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
			  primenumbers=primenumbers+i+" ";
			  
			}
			
		}
		System.out.println(primenumbers);

	}

}
