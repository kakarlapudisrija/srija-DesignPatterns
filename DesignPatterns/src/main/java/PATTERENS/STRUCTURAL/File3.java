package PATTERENS.STRUCTURAL;
public class File3 implements File {

	   private String fileName;

	   public File3(String fileName){
	      this.fileName = fileName;
	      loadFromDisk(fileName);
	   }

	   public void display() {
	      System.out.println("Displaying " + fileName);
	   }

	   private void loadFromDisk(String fileName){
	      System.out.println("Loading " + fileName);
	   }
	}