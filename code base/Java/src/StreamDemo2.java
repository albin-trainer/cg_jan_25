import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamDemo2 {
public static void main(String[] args) {
	Product p1=new Product("A", 10);
	Product p2=new Product("B", 50);
	Product p3=new Product("C", 60);
	ArrayList<Product> plist= new ArrayList<>();
	
	plist.add(p1);plist.add(p2);plist.add(p3);
	
	int totalPrice=findTotal(plist.stream());
	System.out.println(totalPrice);
	Product costliestProd=costliestProduct(plist.stream());
	System.out.println(costliestProd.getPname());
}

static Product costliestProduct(Stream<Product> stream) {
	Comparator<Product> c=(p1,p2)->p1.getPrice()<p2.getPrice()?-1:1;
	Product p=stream.max(c).get();
	return p;
}

static int findTotal(Stream<Product> productStream) {
	int sum=productStream.mapToInt(p->p.getPrice()).sum();
	return sum;
}
}

class Product{
	private String pname;
	private int price;
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}