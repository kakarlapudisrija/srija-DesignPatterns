package PATTERENS.CREATIONAL;

public class Client {
	private final String firstName; 
    private final String lastName;
    private final int age; 
    private Client(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
  
    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", ";
    }
    public static class UserBuilder 
    {
        private final String firstName;
        private final String lastName;
        private int age; 
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public Client build() {
        	Client client =  new Client(this);
            return client;
        }
    }
}
