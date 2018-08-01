import java.util.HashMap;
import java.util.Map;

public class AccountService {
		private static Map<Integer,Account> accountMap = new HashMap<>();
		
		public static boolean addAccount(Account account ){
			boolean success = false;
			if(!accountMap.containsKey(account.accountNumber)) {
				accountMap.put(account.accountNumber, account);
				success = true;
			}else {
				success =false;
			}
			return success;
		}
		public static boolean removeAccount(Account account ){
			boolean success = false;
			if(accountMap.containsKey(account.accountNumber)) {
				accountMap.remove(account.accountNumber);
				success = true;
			}else {
				success =false;
			}
			return success;
		}
		
		public static boolean removeAccount(int accountNumber ){
			boolean success = false;
			if(accountMap.containsKey(accountNumber)) {
				accountMap.remove(accountNumber);
				success = true;
			}else {
				success =false;
			}
			return success;
		}
		
}
