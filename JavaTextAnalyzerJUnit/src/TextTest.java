import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import org.junit.Test;

public class TextTest {

	@Test
	public void test() {
		//Basic interactive GUI added. A text box will require the user to input anything to run the code, otherwise, they'll get an error
   	 int L = -1;
       while (L < 0)
       {
           String input = JOptionPane.showInputDialog("Enter anything in this text box to get started.");
           if (input.length() > 0) {
               L++;
               System.out.println("Success! Check the console to see the word ocurrences in this text file.");
           }else
               System.out.println("An error has occured: There is no input in the text box.");
       }
       //Opening File
       File Poem = new File("src/Poem.txt");
       //creating the file reader
       BufferedReader FileReader = null;
	try {
		FileReader = new BufferedReader(new FileReader(Poem));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       String line;
       //creating hashmap for line count
       Map<String, Long> counts = new HashMap<>();
       try {
		while ((line = FileReader.readLine()) != null) {
		       String[] words = line.split("[\\s.;,?:!()\"]+");
		       for (String word : words) {
		           word = word.trim();
		           if (word.length() > 0) {
		               if (counts.containsKey(word)) {
		                   counts.put(word, counts.get(word) + 1);
		               } else {
		                   counts.put(word, 1L);
		               }
		           }
		       }
		   }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       //output count of every word in the file
       for (Map.Entry<String, Long> entry : counts.entrySet()) {
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
       try {
		FileReader.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //close file reader
	}

}
