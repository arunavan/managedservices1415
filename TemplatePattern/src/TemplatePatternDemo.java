package TemplatePattern.src;

public class TemplatePatternDemo {
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
	//	 Class c=Class.forName(args[0]);
		      
		 

	      Game game = new Chess();
	     // game=new 
	      game.play();
	      System.out.println();
	      game = new Soccer();
	      game.play();		
	   }

}
