package PATTERENS.CREATIONAL;

public class Industry {
	public Excution getExcution(String excutionType)
	{  
		if(excutionType == null){  
			return null;  
		}  
		if(excutionType.equalsIgnoreCase("FIELDEXCUTION")) {  
			return new Field();  
		}   
		else if(excutionType.equalsIgnoreCase("BUSSINESSEXCUTION")){  
            return new Bussiness();  
        }     
		return null;  
	}  
}
