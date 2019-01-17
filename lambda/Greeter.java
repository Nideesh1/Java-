package lambda;

public class Greeter {

	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting ghw = new GreetingHelloWorld();
		greeter.greet(ghw);
		
		MyLambda lmb = () -> System.out.println();
	}
	
}

interface MyLambda{
	void foo();
}
