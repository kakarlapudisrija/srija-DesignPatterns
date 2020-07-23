package PATTERENS.BEHAVIORAL;

public class Initial {
	public void doAction(Content content) {
	      System.out.println("It's in Intial stage");
	      content.setStages(this);	
	   }

	   public String toString(){
	      return "Starting Stage";
	   }
}
