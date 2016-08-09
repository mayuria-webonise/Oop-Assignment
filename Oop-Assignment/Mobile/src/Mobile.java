import java.util.*;


public class Mobile {

	Map<String,MobileFunctionality> functions=null;
	public void dislayFunctions()
	{
		//display available functions 
	}
	
	public MobileFunctionality getFunctionality(String name)
	{
		//returns object of required function
		MobileFunctionality m= functions.get(name);
		return m;
	}
	
}
