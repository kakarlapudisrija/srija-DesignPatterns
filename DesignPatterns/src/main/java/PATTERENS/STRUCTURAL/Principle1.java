package PATTERENS.STRUCTURAL;

public class Principle1 {
	public static void main(String[] args) {
	      Shape example1 = new Example(100,100, 10, new Example1());
	      Shape example2 = new Example1(100,100, 10, new Example2());

	      example1.draw();
	      example2.draw();
	   }
}
