package reflection;

import java.lang.reflect.Field;

public class Main {
	
	/*
	 * If something is inherited..
	 * 
	 * getDeclaredField -> getField
	 * getDeclaredMethod -> getMethod  
	 * */
	
	
	public static void main(String[] args) {
		Person p = new Person("Pog");
		//System.out.println(p.name);
	
		try {
			Field field = p.getClass().getDeclaredField("name");
			field.setAccessible(true);
			System.out.println(field.get(p));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Field field = Person.class.getDeclaredField("numPeople");
			field.setAccessible(true);
			System.out.println(field.get(null));
		} catch (Exception e) {
			
		}
		
	}
}
