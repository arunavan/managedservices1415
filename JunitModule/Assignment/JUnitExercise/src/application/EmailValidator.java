package application;

import com.infy.exception.InfyAcademyException;

public class EmailValidator {
	public boolean validateEmailId(String emailId) throws InfyAcademyException {
		
		if(emailId == null || emailId.isBlank())
			throw new InfyAcademyException("Invalid Email ID");
		return emailId.matches("\\w+@\\w\\.(com|in)");
	}
	
}
