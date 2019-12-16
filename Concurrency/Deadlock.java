import java.util.*;
import java.lang.Thread.*;
import java.text.SimpleDateFormat;

public class Deadlock implements Runnable {

	private static final Object res1 = new Object();
	private static final Object res2 = new Object();
	private final Random rand = new Random(System.currentTimeMillis());

	public static void main(String[] args) {
		Thread mt1 = new Thread(new Deadlock(), "thread1");
		Thread mt2 = new Thread(new Deadlock(), "therad2");
		mt1.start();
		mt2.start();

	}

	public void run(){
		for(int i = 0; i < 10000; i++){
			boolean b = rand.nextBoolean();
			if(b){
				System.out.println("[" + Thread.currentThread().getName() + "] Trying to lock resource 1.");
				synchronized (res1){
					System.out.println("[" + Thread.currentThread().getName() + "] Locked res1");
					System.out.println("[" + Thread.currentThread().getName() + "] trying lock res2");
					synchronized (res2){
						System.out.println("[" + Thread.currentThread().getName() + "] Locked res 2");
					}
				}
						System.out.println("hi");
			} else{

				System.out.println("[" + Thread.currentThread().getName() + "] Trying to lock res2");
				synchronized (res2){
					System.out.println("[" + Thread.currentThread().getName() + "] Locked res 2");
					System.out.println("[" + Thread.currentThread().getName() + "] tryna lock res1");
					synchronized(res1){
						System.out.println("[" + Thread.currentThread().getName() + "] locked res1");
					}
				}

						System.out.println("hi2");

			}
		}
	}

}