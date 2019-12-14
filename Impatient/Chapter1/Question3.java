import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Question3{

	public static void main(String[] args) {
	
		File f = new File("..");
		File[] fs = f.listFiles(fn -> fn.getName().endsWith(".java"));


		Stream<File> str = Stream.of(fs);
		str.forEach(s -> {

			System.out.println(s);

		});
		
	}

}