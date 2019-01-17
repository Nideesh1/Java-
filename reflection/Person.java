package reflection;

public class Person {

	private String name;
	private static int numPeople = 0;
	
	
	public Person(String name) {
		this.name = name;
		numPeople++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void printPerson(Person p) {
		System.out.println(p.getName());
	}
	
	
}
