package exception11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 The try-with-resources statement is a try statement that declares one or more resources. 
 A resource is as an object that must be closed after the program is finished with it. 
 The try-with-resources statement ensures that each resource is closed at the end of the statement. 
 Any object that implements java.lang.AutoCloseable, 
 which includes all objects which implement java.io.Closeable, can be used as a resource.
 bron: http://docs.oracle.com/javase/7/docs/technotes/guides/language/try-with-resources.html
 */
public class Main {
	static final String path = "bestand.txt";

	public static void main(String[] args) throws IOException {
		System.out.println("Reading from: " + new java.io.File( path ).getAbsolutePath());
		String firstLine = readFirstLineFromFile(path);
		System.out.println(firstLine);
		firstLine = readFirstLineFromFileWithFinallyBlock(path);
		System.out.println(firstLine);
	}

	// sinds java 7
	static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		} // br wordt autom. gesloten
	}

	// voor java 7
	static String readFirstLineFromFileWithFinallyBlock(String path)
			throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			if (br != null)
				br.close();
		}
	}
}
