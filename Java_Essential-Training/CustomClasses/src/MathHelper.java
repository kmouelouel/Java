
public class MathHelper {
	public static void add(double doubleValue1, double doubleValue2) {
		System.out.println("the sum of "+ doubleValue1 + " and "+doubleValue2+ " is "+ doubleValue1+doubleValue2);
	}
	public static void sub(double doubleValue1, double doubleValue2) {
			double result=doubleValue1-doubleValue2;
			System.out.println("the sub of "+ doubleValue1 + " and "+doubleValue2+ " is "+result);
		}
	public static void time(double doubleValue1, double doubleValue2) {
		double result=doubleValue1*doubleValue2;
		System.out.println("the multiplication of "+ doubleValue1 + " and "+doubleValue2+ " is "+result);
	}
	public static void div(double doubleValue1, double doubleValue2) {
		double result=doubleValue1/doubleValue2;
		System.out.println("the division of "+ doubleValue1 + " and "+doubleValue2+ " is "+result);
	}

}
