package PATTERENS.CREATIONAL;

public class Principle2 {
	public static void main(String args[])
	{   
		Industry excution = new Industry();
		String excutionName="Domesticplan";   
        int units=567;  
       Excution e = excution.getExcution(excutionName);  
        System.out.print("Bill amount for "+excutionName+" of  "+units+" units is: ");  
        e.getCost();  
        e.calculateBill(units);  
	}  
}
