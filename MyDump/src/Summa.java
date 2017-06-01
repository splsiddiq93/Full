import java.util.HashMap;

public class Summa {

	public static void main(String args[]) {
		HashMap<String, String> s = new HashMap<>();
		s.put("a","A");
		s.put("b","b");
		int a = s.get("a").hashCode();
		int b = s.get("b").hashCode();
		System.out.println(a);
		System.out.println(b);
	}

}
