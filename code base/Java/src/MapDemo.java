import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
public class MapDemo {
	static	HashMap<String, String> map1= new HashMap<>();
public static void main(String[] args) {
	map1.put("E101", "Ramesh");
	map1.put("E102", "Suresh");
	map1.put("E103", "Mahesh");
	map1.put("E104", "Vaishnavi");
	map1.put("E105", "Manasa");
	System.out.println(search("E105"));
	System.out.println(getVal());
	System.out.println(getEmpIds());
	Set<Entry<String, String>> rows=map1.entrySet();
	for(Entry<String, String>r:rows) {
		String k=r.getKey();
		String v=r.getValue();
		System.out.println(k+"  "+v);
	}
	
}
static List<String> getNames(){
	//return the names in the List as sorted order ....
	return null;
}
static String search(String empId) {
	return map1.get(empId);
}
static List<String> getVal(){
	 Collection<String > values= map1.values();
	List<String> names= new ArrayList<>(values);
	return names;
}
static Set<String> getEmpIds(){
	return map1.keySet();
}
}
