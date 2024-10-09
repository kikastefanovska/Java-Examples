package mk.iwec.mapExamples;
import java.util.HashMap;
import java.util.Map;
public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Map <String,Integer> hashMap = new HashMap<>();
			
			hashMap.put("a", 5);
			hashMap.put("b", 10);
			
			hashMap.put("a", 25);
			hashMap.put("c", 25);
			
			System.out.println ("Has key " + hashMap.containsKey("a"));
			
			System.out.println("Has value "  +hashMap.containsValue(25));
			
			System.out.println(hashMap);
	}

}
