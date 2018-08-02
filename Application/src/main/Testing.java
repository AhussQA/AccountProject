package main;
import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {
	@Test
	public void test() {
		Account a1 = new Account("J","J",95786);
		assertTrue("Cannot add",AccountService.addAccount(a1));
		assertFalse("Cannot add again",AccountService.addAccount(a1));
		assertTrue("Should remove",AccountService.removeAccount(a1));
		assertFalse("Nothing to remove",AccountService.removeAccount(a1));

		AccountService.addAccount(a1);
		
		assertTrue(AccountService.removeAccount(a1.accountNumber));
		
		
		a1.setFirstName("Jo");
		a1.setLastName("Jo");
		
		assertEquals("Jo", a1.getFirstName());
		assertEquals("Jo", a1.getLastName());
		assertEquals(95786, a1.getAccountNumber().intValue());
		


	}
	
	
	
}
	