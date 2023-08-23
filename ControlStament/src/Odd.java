import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("enter a values");
		int a=c.nextInt();
		String result;
		result=(a%2==0)?"even":"odd";
		System.out.println(a+" is"+ result+" number");

	}

}
