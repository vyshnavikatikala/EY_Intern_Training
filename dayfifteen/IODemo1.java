package dayfifteen;

import java.io.FileReader;
import java.io.FileWriter;

public class IODemo1 {
	public static void main(String[] args) {
		new CopyCommand().copy("abc.properties");
	}
}

class CopyCommand {

	public void copy(String filename) {
		// FileInputStream fis = null;
		// FileOutputStream fos = null;
		FileReader read = null;
		// FileWriter writer = null;
		try (FileWriter writer = new FileWriter("copyabc.properties")) { // resource block
			// fis = new FileInputStream(filename);
			// fos = new FileOutputStream("copyabc.properties");
			read = new FileReader(filename);
			// writer = new FileWriter("copyabc.properties");
			// System.out.println("No.of bytes..."+fis.available);
			// int noOfBytesRead;
			int noOfCharRead;
			// byte b[] = new byte[8];
			char c[] = new char[8];
			while ((noOfCharRead = read.read(c)) != -1) {
				// System.out.println((char)letter);
				String s = new String(c, 0, noOfCharRead);
				System.out.println(s);
				System.out.println("loop runs...");
				// fos.write(b,0,noOfBytesRead);
				writer.write(c, 0, noOfCharRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// fis.close();
				// fos.close();
				// read.close();
				// writer.close();
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		}
	}
}