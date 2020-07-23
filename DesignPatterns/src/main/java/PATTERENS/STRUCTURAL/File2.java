package PATTERENS.STRUCTURAL;

public class File2 implements File{

	   private File3 file3;
	   private String fileName;

	   public File2(String fileName){
	      this.fileName = fileName;
	   }

	   public void display() {
	      if(file3 == null){
	    	  file3 = new File3(fileName);
	      }
	      file3.display();
	   }
}
