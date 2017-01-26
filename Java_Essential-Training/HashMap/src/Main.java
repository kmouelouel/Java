import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

        HashMap<String, String> map= new HashMap<>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        // output
        System.out.println(map);
        map.put("Alaska", "Juneau");
        System.out.println(map);
        String cap= map.get("Oregon");
        System.out.println("The capital of Oregon is :" +cap);
        map.remove("California");
        System.out.println(map);
        
        

	}

}
