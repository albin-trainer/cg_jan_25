import java.util.HashMap;
import java.util.List;
/*
 * Problem Statement:
Create a custom MultiMap class that allows multiple values for a single key, using a HashMap<K, List<V>> as the underlying data structure. Implement the following methods:
•	put(K key, V value): Adds a value to the list of values associated with the specified key.
•	get(K key): Returns the list of values associated with the specified key, or an empty list if no values are found.
•	removeValue(K key, V value):
 Removes a specific value associated with a key, leaving the key if other values remain.
Example: If you call add("color", "red") 
and then add("color", "blue"), calling get("color") should return ["red", "blue"].
add("car","BMW");
add("car","Alto")
get("car") // return BMW,Alto
 */
public class Main {
	static HashMap<String, List<String>> colors= new HashMap<>(); 
public static void main(String[] args) {
}
 static void add(String color,String v) {
 }
 static List<String> get(String color){
	 return null;
 }
 static void	removeValue(String k, String value) {
	 
 }
}
