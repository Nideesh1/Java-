import java.util.*;
import java.lang.Thread.*;

public class InterruptExample implements Runnable {

	public static void main(String[] args) {
		Thread myt = new Thread(new InterruptExample(), "myt");
		
		try{
		myt.start();

		System.out.println("[" + Thread.currentThread().getName() + "]" + "sleep main thread 5 sec");
		Thread.sleep(5000);

		System.out.println("[" + Thread.currentThread().getName() + "]" + "Interrupting myt");
		myt.interrupt();

		System.out.println("[" + Thread.currentThread().getName() + "]" + "sleep main");
		Thread.sleep(5000);

		System.out.println("[" + Thread.currentThread().getName() + "]" + "Interrupting myt");
		myt.interrupt();			
		}
		catch(Exception e){
			
		}
	}	



	public void run(){
		try{
			Thread.sleep(Long.MAX_VALUE);
		} catch(InterruptedException e){
			System.out.println("[" + Thread.currentThread().getName() + "]" + "Interrupted by exception");
		}

		while(!Thread.interrupted()){
			//do not
		}

		System.out.println("[" + Thread.currentThread().getName() + "]" + "Interrupted by again exception");
	}

}