package text_files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Editing_Files {

	public static void main(String[] args) throws IOException {
	
		File file = new File("C:\\textfiles\\file1.txt");
		
		FileUtils.write(file, "Learning is Growing", "UTF-8", false);
	}

}