package PATTERENS.CREATIONAL;

public class Principle1 {
	public void main(String args[])
	{
		Client client1 = new Client.UserBuilder("Kakarlapudi", "Srija").age(20).build();	 
		System.out.println(client1);
		Client client2 = new Client.UserBuilder("Rohit", "Desai").age(20).build();;
		System.out.println(client2);
		Client client3 = new Client.UserBuilder("Kalpana", "Kakarla").build();
		System.out.println(client3);
	}
}
