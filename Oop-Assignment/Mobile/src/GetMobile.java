import java.util.*;


public class GetMobile {

	public static void main(String []ar)
	{
		Mobile m= new Mobile();
		SetFunctionality s= new SetFunctionality();
		s.setFunctions(m);
		
		MobileFunctionality mb=m.getFunctionality("calling");
		if(mb==null)
		{
			System.out.println("this functionality is not present");
		}
		else
		mb.getFunctionalityDescription();
		
	}
}
