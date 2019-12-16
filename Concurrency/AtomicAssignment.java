import java.util.*;
import java.lang.Thread.*;
import java.text.SimpleDateFormat;

public class AtomicAssignment implements Runnable {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
	private static Map<String,String> config = new HashMap<>();

	public static void main(String[] args) {
		readConfig();
	}

	public static void readConfig(){
		Map<String,String> newconf = new HashMap<>();
		Date now = new Date();
	}

	public void run(){

	}

}