
public class SwithWithEnums {
	public static void main(String[] args) {
	 Month month= Month.February;
		switch (month) {
		case January:
			System.out.println("It is the first month");
			break;
		case February:
			System.out.println("It is the second month");
			break;	
		case March:
			System.out.println("It is the third month");
			break;
		default:
			System.out.println("You chose another month.");
			break;
		}
	}

}
