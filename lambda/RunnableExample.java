package lambda;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Runnable inside anon ");
			}
		});
		
		myThread.run();
		
		Thread myLamdaThread = new Thread(() -> {System.out.println("Runnable inside lamd"); });
		myLamdaThread.run();
	}

}
