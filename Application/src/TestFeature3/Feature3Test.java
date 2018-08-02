package TestFeature3;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;

import main.Account;
import main.AccountService;

public class Feature3Test {

	@Test
	public void test() {
		Account a1 = new Account("J","J",1292);
		Account a2 = new Account("J","J",1293);
		Account a3 = new Account("Ja","J",1294);
		Account a4 = new Account("JO","J",1295);
		
		AccountService.addAccount(a1);
		AccountService.addAccount(a2);
		AccountService.addAccount(a3);
		AccountService.addAccount(a4); 

		List<Account> accounts = AccountService.getAccountsByName("J");
		assertEquals("Not the same size",2,accounts.size());
		assertEquals("Not the same",2,AccountService.getNumberOfAccounts("J"));

		
		
	
	}
}
