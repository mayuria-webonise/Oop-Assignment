import java.util.Map;


public class TV implements ElectricAppliances {

	Map <String, TVComponents> m;
	TVComponents t;

	
	public void powerOn()
	{
		//power on TV
	}
	
	public void viewSettings()
	{
		// display settings
	}
	
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}
	
	public void getComponents(String name)
	{
		//get asked component
		t=m.get(name);
		t.ComponentDescription();
		
	}
	public void setComponents()
	{
		TVComponentSetter t= new TVComponentSetter();
		m=t.setComponents();
		
	}
	
	
}
