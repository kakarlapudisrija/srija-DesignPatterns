package PATTERENS.STRUCTURAL;

public class Example extends Logic {
	   private int x, y, radius;

	   public Example(int x, int y, int radius, Construct construct) {
	      super(consruct);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void construct() {
	      construct.constructLogic(radius,x,y);
	   }
}
