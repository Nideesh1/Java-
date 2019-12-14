import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Question2 {

	public static void main(String[] args) {
	
		File f = new File("..");
		File[] fs = f.listFiles();

		// for(File fl : fs){
		// 	System.out.println(fl.getName());
		// }
		Stream<File> str = Stream.of(fs);
		str.forEach(s -> {

			if(s.isDirectory()){
				System.out.println(s);
			}

		});


	}

}
