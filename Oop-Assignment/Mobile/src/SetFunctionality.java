import java.util.HashMap;


public class SetFunctionality {

	// whenever new functions to be added it can be added here
	public void setFunctions(Mobile m)
	{
		m.functions= new HashMap<String, MobileFunctionality>();
		m.functions.put("calling", new Calling());
		m.functions.put("Messanger", new Messenger());
		m.functions.put("Media", new Media());
		m.functions.put("Contacts", new Contacts());
	}
}
