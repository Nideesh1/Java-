import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Question4{

	public static void main(String[] args) {
	

		File f = new File("..");
		File[] fs = f.listFiles();
		Arrays.sort(fs, (a,b) ->{
			if(a.isDirectory() && !b.isDirectory()){
				return -1;
			}else if (!a.isDirectory() && b.isDirectory()){
				return 1;
			}else{
				return a.getName().toLowerCase().compareTo(b.getName().toLowerCase());
			}
		});

		Arrays.asList(fs).forEach(System.out::println);

	}

}