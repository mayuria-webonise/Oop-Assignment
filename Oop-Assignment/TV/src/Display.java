
public class Display implements TVComponents {

	String display_type;

	@Override
	public void ComponentDescription() {
		// TODO Auto-generated method stub
		System.out.print("Display is colored");
	}
	
	public void setDisplay(String type)
	{
		this.display_type=type;
		//set display type whether it is black and white or colored 
	}
}
