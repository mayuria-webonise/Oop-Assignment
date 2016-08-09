import java.util.HashMap;
import java.util.Map;


public class TVComponentSetter {
	
	
	Map <String,TVComponents> m;
	// this class sets all components for TV
	
	public Map<String, TVComponents> setComponents()
	{
		m=new HashMap<String, TVComponents>();
		m.put("Remote", new Remote());
		m.put("Display", new Display());
		return m;
	}
	
	
}
