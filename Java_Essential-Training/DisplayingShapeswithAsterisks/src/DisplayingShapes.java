
public class DisplayingShapes {

	public static void main(String[] args) {
		String line= new String("**********");
		int len=line.length();
		System.out.println(line);
		while (len>1) {
		line=line.substring(0, len-1);
		System.out.println(line);
		len--;
		}

	}
    

}
