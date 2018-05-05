package utility;

import java.util.Map;

public class SessionCleaner {
	
	public static void clean(Map<String,Object> session){
		session.remove("pFirstName");
		session.remove("pLastName");
		session.remove("pMiddleName");
		session.remove("pBirthMonth");
		session.remove("pBirthDay");
		session.remove("pBirthYear");
		session.remove("pGender");
		session.remove("pBirthPlace");
		session.remove("pCitizenship");
		session.remove("pReligion");
		session.remove("pCivil");
		session.remove("pJob");
		session.remove("pContactA");
		session.remove("pTypeA");
		session.remove("pContactB");
		session.remove("pTypeB");
		session.remove("pContactC");
		session.remove("pTypeC");
		session.remove("pEmail");
		session.remove("pStreet");
		session.remove("pCity");
		session.remove("pCountry");
		session.remove("pZip");
		
	}
	
}
