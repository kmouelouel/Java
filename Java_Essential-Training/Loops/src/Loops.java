
public class Loops {

	static private String[] months ={"January", "February","March","April",
			"May","June","July","August","September","October","November","December"
	};
	public static void main(String[] args) {
		System.out.println("Print out the months' list using for loop");
		for (int i = 0; i < months.length; i++) {
			System.out.print(months[i]);
			System.out.print(" ");
		}
	
		System.out.println("\nPrint out the months' list using foreach loop ");
		// foreach month in the months list
		for (String month : months) {
			System.out.print(month);
			System.out.print(" ");
		}
//		
	// using while loop 
		
		System.out.println("\nPrint out the months' list using while loop ");
		int counter=0;
		while (counter< months.length) {
			System.out.print(months[counter]);
			System.out.print(" ");
			counter++;
			
		}
		
		System.out.println("\n Print out the months' list using do while loop ");
		 counter=0;
		do {
			System.out.print(months[counter]);
			System.out.print(" ");
			counter++;
		} while (counter< months.length);

	}

}
