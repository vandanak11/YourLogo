package StepDefinitions;

import java.util.*;

public class RandomTestDataGenerator {
	Random r = new Random();
	
	public String ReturnRandomString(String string) {
		return(string + r.nextInt());
	}
	
	public String ReturnRandomEmail(String string) {
		return(string+r.nextInt()+"@email.com");
	}
	
}