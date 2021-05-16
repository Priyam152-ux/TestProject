package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {

		AccountHolder Tom = new AccountHolder();
		AccountHolder Max = new AccountHolder();
		AccountHolder Henry = new AccountHolder();
		AccountHolder Sarah = new AccountHolder();

		Tom.fisrtname = "Tom";
		Tom.lastname = "Mishra";
		Tom.age = 21;
		Tom.accountbalance = 10000;
		Tom.testeligibilityforcreditcard();
		System.out.println("Is Tom eligible for credit card: " + Tom.eligibleforcreditcard);
		
		Max.fisrtname = "Tom";
		Max.lastname = "Mishra";
		Max.age = 21;
		Max.accountbalance = 10000;
		Max.testeligibilityforcreditcard();
		System.out.println("Is Max eligible for credit card: " + Max.eligibleforcreditcard);
		
		Henry.fisrtname = "Henry";
		Henry.lastname = "Tyagi";
		Henry.age = 32;
		Henry.accountbalance = 30000;
		Henry.testeligibilityforcreditcard();
		System.out.println("Is Henry eligible for credit card: " + Henry.eligibleforcreditcard);

		Sarah.fisrtname = "Tom";
		Sarah.lastname = "Mishra";
		Sarah.age = 25;
		Sarah.accountbalance = 19000;
		Sarah.testeligibilityforcreditcard();
		System.out.println("Is Sarah eligible for credit card: " + Sarah.eligibleforcreditcard);

	}

}
