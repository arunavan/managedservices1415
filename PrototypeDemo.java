package prototype;
class Category //implements Cloneable
{
	Integer id;
	String type;
	public Category(Integer id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	/*
	 * public Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */
	@Override
	public String toString() {
		return "Category [id=" + id + ", type=" + type + "]";
	}
	
	
}
class Product implements Cloneable{
	Integer id;
	String name;
	Double price;
	Double qty;
	Category category;
	
	
	
	public Product clone() throws CloneNotSupportedException {
		  Product p=(Product)super.clone();
		//  p.category=(Category)category.clone();
		 return  p;
		 
		 
	}
	
	
	public Product(Integer id, String name, Double price, Double qty, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", category=" + category
				+ "]";
	}


	
	
	
	
	
}
public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Product p1=new Product(1,"box",70.00,999.00,new Category(101,"large"));
		System.out.println("Before clone:"+p1  +p1.hashCode());
		Product p2=p1.clone();
		System.out.println("Before clone:"+p2  +p2.hashCode());
	}

}
