
public class Fibnoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.println("");
			}
			if(i%2!=0)
			{
				for(int k=1;k<=i;k++)
				{
					System.out.print(" *");
				}
				System.out.println();	
			}
		}

	}

}
