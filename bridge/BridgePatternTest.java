package bridge;

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape tri1 = new Triangle(new GreenColor());
		tri1.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
		
		Shape pent1 = new Pentagon(new RedColor());
		pent1.applyColor();
	}

}
