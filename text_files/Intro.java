package text_files;

import java.io.File;
import java.io.IOException;


public class Intro {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\textfiles\\file1.txt");
		
		String x = FileUtils.readFileToString(file, "UTF-8");
		
		System.out.println(x);
		
	}

}
