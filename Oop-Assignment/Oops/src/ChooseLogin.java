import java.util.*;


public class ChooseLogin {

	

	public Login loginSelector(String site) {
		// TODO Auto-generated method stub
		Login l=null;
		
		
		Map <String, Login> socialsites= new HashMap<String,Login>();
	    socialsites.put("facebook",new FacebookLogin());
	    socialsites.put("twitter", new TwitterLogin());
	    socialsites.put("Linkedin", new LinkedInLogin());
	    
	    l=socialsites.get(site);
		
		
		return l;
		
	}
	
}
