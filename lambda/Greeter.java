package lambda;

public class Greeter {

	
	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		Greeting greeting = new GreetingHelloWorld();
		Greeting lmb = () -> System.out.println("HI");
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("HI asdf");
			}
		};
		
		
		lmb.perform();
	}
	
}
