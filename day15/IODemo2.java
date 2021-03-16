package day15;

import java.io.File;
import java.io.FilenameFilter;

public class IODemo2 {
	public static void main(String[] args) {
		File file = new File("c:/temp");

		System.out.println("Path..." + file.getAbsolutePath());
		System.out.println("Name of the file...:" + file.getName());
		System.out.println("Does the file exists...");
		System.out.println(file.exists() ? "yes it exists" : "No it does not exist");
		System.out.println(file.canWrite());
		System.out.println(file.isDirectory());
		File destFile = new File("c:/temptemp"); // renaming the file
		file.renameTo(destFile);

		String s[] = destFile.list(new MyFilter("txt"));
		for (String ss : s) {
			System.out.println(ss);
		}
	}
}

class MyFilter implements FilenameFilter {
	String extension;

	public MyFilter(String extension) {
		this.extension = extension;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith("." + extension);
	}

}
