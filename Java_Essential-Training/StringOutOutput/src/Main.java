import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='z';
        boolean bool=true;
        byte b= 127;
        short s=32000;
        int i= 2000000;
        long l=1000000L;
        float f=12345.54321f;
        double d=123123111231.34d;
        System.out.println(c);
        System.out.println(bool);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println("the value of s is: " + s);
        System.out.println(s+ " is the value of s");
        
        Date mydate= new Date();
        System.out.println(" the new date is " +mydate.toString());
        
        
	}

}
