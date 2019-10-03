package Lab3a;
import java.util.*;

public class BuddyInfo {
	
	// instance variables
	
		private String buddyName = "";
		private String dob = "";
		private String number = "";
		
		// Constructors
		
		/**
		 * Default constructor,
		 * sets the instance variables to default values
		 */
		public BuddyInfo() {
			this("Abdulla Al-wazzan", "06/08/95", "819-5933339");
		}
		
		/**
		 * Creates a Buddy with desire info
		 * @param name
		 * @param dob	Please enter in the form "DD/MM/YY
		 * @param number
		 */
		
		public BuddyInfo(String name, String dob, String number) {
			
			if((name == null) || (dob == null) || (number == null)) {
				throw new NullPointerException("Please enter all fields.");
			}
			else {
				this.buddyName = name;
				this.dob = dob;
				this.number = number;
			}
		}
		
		// name accessors and mutators
		
		/**
		 * Edits a Buddy's name
		 * @param name, Buddy's NEW name
		 */
		public void setName(String newName) {
			
			buddyName = newName;
			System.out.println("new name is " + this.getName());
		}
		
		/**
		 * Returns the Buddy's name
		 * @return	name
		 */
		public String getName() {
			
			return buddyName.toString();
		}
		
		// dob accessors
		
		/**
		 * Returns Buddy's date of birth
		 */
		public String getDob() {
			return dob.toString();
		}
		
		// address accessors and mutators
		
		/**
		 * Edits Buddy's number
		 * @param newNumber
		 */
		public void setNumber(String newNumber) {
			this.number = newNumber;
			
		}
		
		/**
		 * Returns Buddy's number
		 * @return	String
		 */
		public String getNumber() {
			return this.number.toString();
		}
		
		/**
		 * Prints Buddy's Info
		 * @return String in the form, "Abdulla Al-wazzan's information is:
		 * 								dob is: 06/08/95
		 * 								number is: 819-5933339
		 * 								
		 * 																
		 * @override
		 */
		@Override
		public String toString() {
			String s1 = this.getName();
			String s2 = "	   		dob is: " + this.getDob();
			String s3 = "	   		number is: " + this.getNumber();
			return s1 + "'s information is: " + "\n" + s2 + "\n" + s3;
		}
		
		public static void main(String[] args) {
			
			System.out.println("Hello World!");
			Scanner scan = new Scanner(System.in);		// hello scanner
			String temp1, temp2, temp3;
			
			System.out.print("Please Buddy's name: ");
			temp1 = scan.nextLine();
			System.out.println();
			
			System.out.print("Please Buddy's dob: ");
			temp2 = scan.nextLine();
			System.out.println();
			
			System.out.print("Please Buddy's number: ");
			temp3 = scan.nextLine();
			System.out.println();
			
			scan.close();								// bye scanner
			
			BuddyInfo b = new BuddyInfo(temp1, temp2, temp3);
			b.setName("paul");
			
			b.getName();
			System.out.println(b.toString());
			// TODO Auto-generated method stub
		}
	

}
