import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
	list.stream().filter( (n)->n%2==0).forEach((n)->System.out.println(n));
	System.out.println("--------------------------");
	//directly can create stream ....
	Stream.of(1,2,3,4,5).filter( (n)->n%2==0).forEach((n)->System.out.println(n));
	//IntStream
	//find the sum of even nos
	int s=IntStream.of(1,2,3,4,5,6).filter( (n)->n%2==0).sum();
	System.out.println("Sum :"+ s);
	s=list.stream().mapToInt(n->n).sum();
	System.out.println("Sum :"+ s);

	
}
}
