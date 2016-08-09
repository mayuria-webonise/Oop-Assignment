import java.util.Scanner;


public class Main {

	public static void main(String [] ar)
	{
		
		System.out.println("Enter the social website to login");
		Scanner sc=new Scanner(System.in);
		String site=sc.nextLine();
		ChooseLogin s=new ChooseLogin();
		Login l= s.loginSelector(site);
		if(l==null)
			System.out.println("this site doesnt exist");
		else
		{
			l.getCredentialsFromUser();
			l.authenticate();
			l.messageGUI();
		}
		
	}
	
}
