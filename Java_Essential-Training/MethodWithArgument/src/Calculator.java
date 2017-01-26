
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Calculator {

	public static void main(String[] args) {
		
        String Value1=getInput("Enter the first numeric value : ");
        String Value2=getInput("Enter the second numeric value : ");
       // System.out.println(ValueIn);
        double result = addTwoValue(Value1, Value2);
       System.out.println("the sum is :"+result);
       double resultMultiple=addMultipleValues(5,6,12,25,80);
       System.out.println("The answer from multiple values 5,6,12,25,80 is :"+resultMultiple);
	}

	private static double addTwoValue(String Value1, String Value2) {
		double doubleValue1=Double.parseDouble(Value1);
        double doubleValue2= Double.parseDouble(Value2);
        
        double result=doubleValue1+doubleValue2;
		return result;
	}

	private static String getInput(String prompt) {
           BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
           System.out.print(prompt);
           System.out.flush();
           try{
        	   return stdin.readLine();
           }catch(Exception e){
        	   return "Error: " +e.getMessage();
           }
		
	}
	private static double addMultipleValues(double ... values) {
		double result=0d;
		for (double d: values) {
			result +=d;
			
		}
		return result;
	}

}
