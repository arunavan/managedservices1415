package cor;
import java.util.Scanner;
public class ATMDispenseChain {
	private DispenseChain c1;
	public ATMDispenseChain() {   //2000,500,200,100,50
	    this.c1 = new Rupees50Dispenser();// chain intilaization
		DispenseChain c2 = new Rupees20Dispenser();
		DispenseChain c3 = new Rupees10Dispenser();
		c1.setNextChain(c2); // set the chain of responsibility
		c2.setNextChain(c3);
	}
	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			atmDispenser.c1.dispense(new Currency(amount));
		}
	}
}

