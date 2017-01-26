
public class MethodOverLoading {

	public static void main(String[] args){
		int value1=5, value2=12,value3=100, result=0;
		result=addValues(value1, value2,value3);
		System.out.println("the result is :"+ result);
		String string1="50", string2="70";
		result=addValues(string1, string2);
		System.out.println("the result of add to string  is :"+ result);
		
	}
	private static int addValues(int num1, int num2,int num3){
		return num1+num2+num3;
	}
	
	private static int addValues(int num1, int num2){
		return num1+num2;
	}
	private static int addValues(String val1, String val2){
		int num1=Integer.parseInt(val1);
		int num2=Integer.parseInt(val2);
		return num1+num2;
	}
}
