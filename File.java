import java.io.FileInputStream;
import java.io.FileOutputStream;
public class File {
	public static void main(String[] args) {
		FileInputStream readFile = null;
		FileOutputStream writeFile = null;
		String s = "";
		try {
			readFile = new FileInputStream("C:/Users/sthan/Desktop/java.txt");
			writeFile = new FileOutputStream("C:/Users/sthan/Desktop/new_java.txt");
			int b;
			System.out.print("Text read from file: ");
			while((b=readFile.read())!=-1) {
				System.out.print((char) b);
				s+=(char) b;
			}
			System.out.println("");
			readFile.close();
			byte writeByte[] = s.getBytes();
			writeFile.write(writeByte);
			System.out.println("Data successfully written to new file.");
			writeFile.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
