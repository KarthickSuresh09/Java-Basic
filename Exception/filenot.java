package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filenot {
 public static void main(String[]args) throws IOException {
	try {
	 //File f=new File("//Users//macbookair//Downloads//resume//_Karthick Suresh Tcs & GIERP.docx");
	 
	 FileReader fr=new FileReader("//Users//macbookair//Downloads//resume//_Karthick Suresh Tcs & GIERP.docx");
	 
	 int temp=0;
	 while((temp=fr.read())!=-1) {
		 System.out.print((char)(temp));
	 }
 }
	catch(FileNotFoundException ex) {
		System.out.println("Error");
	}
 }
}
