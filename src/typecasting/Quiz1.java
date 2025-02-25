package typecasting;

public class Quiz1 {

	public static void main(String[] args) {
		
		Parents pc = new Child("한국", "고", "길동");
		
		System.out.println(pc.lastName);
		System.out.println(pc.nationality);
	}

}

class Parents {
	String nationality;
	String lastName;
	public Parents(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}	
}

class Child extends Parents {
	String firstName;

	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
	}
	
}