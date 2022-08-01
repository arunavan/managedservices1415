package singleton;
class Singleton1{
	private static Singleton1 s;
	
	private Singleton1()
	{}
	public static  Singleton1 getInstance() {
		
		if (s==null) {
			synchronized(Singleton1.class) {
				s=new Singleton1();
			}
		}
		return s;
	}

}
public class Singletondemo {
	public static void main(String[] args) {
		//Singleton1 s2=new Singleton1();
		Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance();
		System.out.println(s1+"  "+s2);
		System.out.println(s1.hashCode()+"  "+s2.hashCode());
		

	}

}
