package classesandobjects;

public class AccountHolder {
	
	String fisrtname;
	String lastname;
	int age;
	float accountbalance;
	boolean eligibleforcreditcard;
	
	public void testeligibilityforcreditcard() {
		
		if(age>25 && accountbalance>=20000) {
			eligibleforcreditcard=true;
		}
	}
}
