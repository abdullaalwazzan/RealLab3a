package Lab3a;

import java.util.*;

public class AddressBook {
	private ArrayList<BuddyInfo> list; // ArrayList to contain BuddyInfo objects

	/**
	 * constructor, initializes ArrayList, list
	 */
	public AddressBook() {
		this.list = new ArrayList<>();
	}

	/**
	 * 
	 * @param o, desired BuddyInfo to enter in address book
	 * @throws null pointer exception if object to be added is null
	 */
	public void addBuddy(BuddyInfo o) {
		
		if (o == null) {
			throw new NullPointerException("Nothing to add");
		}
		else{
			this.list.add(o);
		}
	}

	/**
	 * 
	 * @param o, indicates which buddy to remove.
	 */
	public void removeBuddy(int index) {
		if ((index < 0) || (index >= list.size())) {
			throw new IllegalArgumentException("out of bounds idiot!!");
		} else {
			this.list.remove(index);
		}

	}
	
	/**
	 * returns 1st instance of desired Buddy
	 * @return buddyInfo buddy
	 */
	public BuddyInfo getBuddy(String name) {
		for(int i = 0 ; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				return list.get(i);
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Address book");
		BuddyInfo buddy0 = new BuddyInfo("pawool", "01/01/01", "613 0000001");
		AddressBook af = new AddressBook();

		af.addBuddy(buddy0);
		System.out.println("hello " + buddy0.getName());
		
		BuddyInfo buddy1 = new BuddyInfo("Abdulla", "01/01/01", "1234567");
		af.addBuddy(buddy1);
		System.out.println("hello " + buddy1.getName());
 
		buddy0.setName("name");
		
		af.removeBuddy(1);
		System.out.println("Bye " + buddy1.getName());
		
		if (af.list.isEmpty()) {
			System.out.println("address book is empty.");
		}
		else {
			for(int i = 0; i < af.list.size(); i++) {
				System.out.println(af.list.get(i).toString());
			}
		}
	}

}
