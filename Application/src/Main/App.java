package Main;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Account a1 = new Account("John","Doe",18567);
		Account a2 = new Account("Jane","Doe",16758);
		Account a3 = new Account("John","Doe",18568);

		
		AccountService.addAccount(a1);
		AccountService.removeAccount(a2);
		AccountService.addAccount(a2);
		AccountService.removeAccount(a2);
		AccountService.addAccount(a1);
		AccountService.addAccount(a3);

		
		AccountService.mapToJson();
		System.out.println(AccountService.getAccountsByName("John"));
		System.out.println(AccountService.getNumberOfAccounts("John"));

		
	}
}
