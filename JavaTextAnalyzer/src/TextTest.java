import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TextTest {

	@Test
	public void test() throws FileNotFoundException {
		System.out.println("Waiting for user input");
        try {
			System.in.read();
		} catch (IOException e1) {
			e1.printStackTrace();
		}//wait for the user to press a key to run the code
        //Opening File
        File Poem = new File("src/Poem.txt");
        //creating the file reader
        BufferedReader FileReader = new BufferedReader(new FileReader(Poem));
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
		} catch (IOException e1) {
			e1.printStackTrace();
		}
        //output count of every word in the file
        for (Map.Entry<String, Long> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        try {
			FileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} //close file reader
		fail("Error displaying text correctly.");
	}

}
