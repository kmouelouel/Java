
public class Main {

	public static void main(String[] args) {
		
		try {
			String[] strings={"Welcome"};
			System.out.println(strings[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("there is an error!");
		}
        
        System.out.println("the application is still running");

	}

}
