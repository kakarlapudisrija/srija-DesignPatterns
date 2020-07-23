package PATTERENS.BEHAVIORAL;

public class Final {
	public void doAction(Content content) {
	      System.out.println("It's in final stage");
	      content.setStages(this);	
	   }

	   public String toString(){
	      return "Final Stage";
	   }
}
