//Luis Jimenez, 9/18/2022


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;



public class TextAnalyzer {
    public static void main(String[] args) throws IOException {
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
        BufferedReader FileReader = new BufferedReader(new FileReader(Poem));
        String line;
        //creating hashmap for line count
        Map<String, Long> counts = new HashMap<>();
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
        //output count of every word in the file
        for (Map.Entry<String, Long> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        FileReader.close(); //close file reader
    }
}

