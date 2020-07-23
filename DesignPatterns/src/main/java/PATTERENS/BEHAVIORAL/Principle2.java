package PATTERENS.BEHAVIORAL;

public class Principle2 {
	public static void main(String[] args) {
	      Content content = new Content();

	      Initial level1 = new Intial();
	      level1.doAction(content);

	      System.out.println(content.getStages().toString());

	      Final level2 = new Final();
	      level2.doAction(content);

	      System.out.println(content.getStages().toString());
	}
}
