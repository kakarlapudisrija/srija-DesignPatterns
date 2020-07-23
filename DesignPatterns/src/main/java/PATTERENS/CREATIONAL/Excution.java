package PATTERENS.CREATIONAL;

abstract class Excution {
	         protected double cost;  
	         abstract void getCost();  
	   
	         public void calculateBill(int units){  
	              System.out.println(units*cost);   
	          }
}
