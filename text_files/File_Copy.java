package text_files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class File_Copy {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1. Copy contents of one file to another
		 * 2. Copy a file to directory
		 * 3. Rename / Move a file
		 */
		
		File file1 = new File("C:\\textfiles\\file1.txt");
		File file2 = new File("C:\\textfiles\\file2.txt");
		File dir = new File("/Users/bianc/Documents/TextFiles/Dir1");
		File file3 = new File("/Users/bianc/Documents/TextFiles/file3.txt");
		
		FileUtils.copyFile(file1, file2);
		FileUtils.copyFileToDirectory(file1, dir);
		FileUtils.moveFile(file1, file3);
		
		
	}
}