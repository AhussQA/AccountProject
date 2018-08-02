package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

public class AccountService {
	private static Map<Integer, Account> accountMap = new HashMap<>();

	public static boolean addAccount(Account account) {
		boolean success = false;
		if (!accountMap.containsKey(account.getAccountNumber())) {
			accountMap.put(account.getAccountNumber(), account);
			success = true;
		} else {
			success = false;
		}
		return success;
	}

	public static boolean removeAccount(Account account) {
		boolean success = false;
		if (accountMap.containsKey(account.getAccountNumber())) {
			accountMap.remove(account.getAccountNumber());
			success = true;
		} else {
			success = false;
		}
		return success;
	}

	public static boolean removeAccount(int accountNumber) {
		boolean success = false;
		if (accountMap.containsKey(accountNumber)) {
			accountMap.remove(accountNumber);
			success = true;
		} else {
			success = false;
		}
		return success;
	}

	public static String mapToJson() {
		JSONObject jsonObject = new JSONObject(accountMap);
		System.out.println(jsonObject);
		return jsonObject.toString();
	}

	public static List<Account> getAccountsByName(String name) {
		List<Account> accounts = new LinkedList();
		Iterator<Integer> iterator = accountMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			Account account = accountMap.get(integer);
			if (account.getFirstName().equalsIgnoreCase(name)) {
				accounts.add(account);
			}

		}
		return accounts;
	}

	public static int getNumberOfAccounts(String firstName) {
		int numberOfAccounts = 0;
		Iterator<Integer> iterator = accountMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			Account account = accountMap.get(integer);
			if (account.getFirstName().equals(firstName)) {
				numberOfAccounts++;
			}
		}
		return numberOfAccounts;
	}
}
