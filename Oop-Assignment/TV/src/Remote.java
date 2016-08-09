import java.util.HashMap;
import java.util.Map;


public class Remote implements TVComponents {

	private String companyName;
	private Map<String,Button> b;
	public void ActionOnPressedButton(String key)
	{
		//get the type of button user pressed and initialize accordingly
		Button bt=b.get(key);
		bt.onPressAction();
	}
	
	public void setButtons()
	{
		b=new HashMap<String, Button>();
		b.put("volumeButton", new VolumeButton());
		b.put("ChannelButton", new ChannelButton());
		
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public void ComponentDescription() {
		// TODO Auto-generated method stub
		System.out.println("Component remote");
	}
	
}
