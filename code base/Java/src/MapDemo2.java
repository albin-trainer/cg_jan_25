import java.util.HashMap;

public class MapDemo2 {
	static HashMap<String, Integer> map=new HashMap<>();
public static void main(String[] args) {
	map.put("A", 1);
	map.put("B", 2);
	map.put("C", 3);
	map.put("E", 4);
	map.put("F", 5);
	map.put("H", 6);
	System.out.println(sum());
	
	add("A:6");
	System.out.println(map);
}
static int sum () {
	return 0;
}
static void add(String data) {
	//split by : means A is key and 6 is the Val
	//if A already present  add the value with the existing value i.e 6+1 for A
	 //else if Key not present just add the key and value
}

}
