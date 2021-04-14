import java.util.Scanner;
public class prac2
{
	public static void main(String []args)
	{
		System.out.println("\n \t ------------------- W E L C O M E ----------------");
		long a;
		System.out.print("\n \t CHOOSE THE FOLLOWING TO START: \n \n \t 1. ENCRPT THE NUMBER \n \t 2. DECRYPT THE NUMBER \n \n \n \t ENTER YOUR CHOICE :	");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch(choice)
		{
		
		case 1 :
				System.out.print(" \n \t ENTER A KEY UPTO 3 DIGITS :	");
		int encryptkey = s.nextInt();
		if ( encryptkey > 999 )
		{
			System.out.println("\n \t!!!!!!!!!!! ERROR: ENTER VALID KEY !!!!!!!!!");
			java.lang.System.exit(0);
		}
		if (encryptkey < 100 )
		{
			System.out.println("\n \t!!!!!!!!!!! ERROR: ENTER VALID KEY !!!!!!!!!");
			java.lang.System.exit(0);
		}
		System.out.print("\n \t Enter the NUMBER to be encrpted :	");
		a = s.nextLong();
		System.out.println("\n \t Encrypted NUMBER are = "+ (a * (encryptkey / 2) ));
		break;
		case 2 :
				System.out.print(" \n \t ENTER A KEY UPTO 3 DIGITS :	");
		encryptkey = s.nextInt();
		if ( encryptkey > 999 )
		{
			System.out.println("\n \t!!!!!!!!!!! ERROR: ENTER VALID KEY !!!!!!!!!");
			java.lang.System.exit(0);
		}
		if (encryptkey < 100 )
		{
			System.out.println("\n \t!!!!!!!!!!! ERROR: ENTER VALID KEY !!!!!!!!!");
			java.lang.System.exit(0);
		}
		System.out.print("\n \t Enter the NUMBER to be decrpted : 	");
		a = s.nextLong();
		System.out.println("\n \t Decrypted NUMBER are = "+ (a / (encryptkey / 2 )));
		break;
		default:
		System.out.println("\n \t !!!!!!!!! ERROR : ENTER VALID CHOICE !!!!!!!!!!!");
		}
		
	}
}
