import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
 
	public static void main(String[] args){
		Date date=new Date();
		System.out.println(date);
		GregorianCalendar gc=new GregorianCalendar(2017,1,21);
		gc.add(GregorianCalendar.DATE,1);
		Date d2= gc.getTime();
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
		String d=df.format(d2);
		System.out.println(d);
		
	}
}
