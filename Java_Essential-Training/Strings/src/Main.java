
public class Main {

	public static void main(String[] args) {
		String s1="welcome to California!";
		String s2= new String("Welcome to California!");
		System.out.println(s2);
		if (s1.equals(s2)) {
			System.out.println("they match!");
		}else{
			System.out.println("they don't match!");
		}
		char[] chars=s1.toCharArray();
		for (char c : chars) {
			System.out.println(c);
		}
	}

}
