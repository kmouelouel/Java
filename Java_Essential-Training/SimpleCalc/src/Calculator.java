import java.io.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String Value1=getInput("Enter the first numeric value : ");
        String Value2=getInput("Enter the second numeric value : ");
       // System.out.println(ValueIn);
        double doubleValue1=Double.parseDouble(Value1);
        double doubleValue2= Double.parseDouble(Value2);
        double result=doubleValue1+doubleValue2;
       System.out.println("the sum is :"+result);
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

}
