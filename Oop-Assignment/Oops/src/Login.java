
public abstract class Login implements Authenticate1, DisplayMessage {
	private String username;
	private String password;
	public void setCredentials(String uname,String pwd)
	{
		username=uname;
		password=pwd;
	}
	public void getCredentialsFromUser()
	{
		//get input from user of username and password
		System.out.println("get input from user of username and password");
	}
	public String getUsername()
	{
		return username;
		
	}
	public String getPassword()
	{
		return password;
	}
	//public abstract void authenticate();
	//public abstract void displayMessage();
}
