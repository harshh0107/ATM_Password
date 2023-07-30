import java.lang.*;
import java.util.*;

public class Password
{
	public static void main(String arg[])
	{
		int pass,npass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Set your ATM Password: ");
		pass = sc.nextInt();
		System.out.println("Enter the Password:");
		npass = sc.nextInt();
		if(npass == pass)
		{
			System.out.println("Your Password has been confirmed. Thank You.");
		}
		else
		{
			int count=0;
			for(int i=0;i<3;i++)
			{
				
				System.out.println("Enter your Password for " +count+ " time :");
				npass = sc.nextInt();
				
				count++;
				if(npass == pass)
				{
					System.out.println("We have confirmed your Password after attempting for "+count+" times. Thank You.");
					break;
				}	
				
			}
			System.out.println("To many unusual attempts. Visit your near by Bank to verify your Password. Thank You.");
		}
	}
}