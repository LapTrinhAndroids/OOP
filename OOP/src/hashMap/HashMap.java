package hashMap;

import java.util.Scanner;

public class HashMap {

	public static void main(String[] argv) {
		System.out.println("Hash Map");
		java.util.HashMap<String, String> hashmap = new java.util.HashMap<String, String>();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("unused")
		Scanner input1 = new Scanner(System.in);

		String username, password;
		int n;

		do {
			System.out.println("Enter username: ");
			username = input.nextLine();

			System.out.println("Enter password: ");
			password = input.nextLine();

			hashmap.put(username, password);
			
			System.out.println("Do you want to continues 1/0 (Yes/No)?");
			n = input1.nextInt();
		} while (n != 0);

		for (String i : hashmap.keySet()) {
			System.out.println(hashmap.get(i));
		}
	}

}
