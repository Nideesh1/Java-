package lambda;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		lfunc( s -> s.length() );
	}
	
	public static void lfunc(StringLengthLambda l) {
		System.out.println(l.getLength("dfasdf"));
	}

	interface StringLengthLambda{
		int getLength(String s);
	}
	
}
