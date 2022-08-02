package adapter;


interface vehicle{
	void speed();
	int milage();
	double fuelCharges();
}

class Bike implements vehicle{
	public void speed() {}
	public int milage()
	{ return 9;}
	
	public double fuelCharges() 
	{
		return 9.0;
	}
}


public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
