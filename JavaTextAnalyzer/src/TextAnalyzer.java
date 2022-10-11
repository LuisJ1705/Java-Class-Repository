//Luis Jimenez, 9/18/2022


import java.io.*;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TextAnalyzer {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
    	//Create the frame of the Window
        JFrame Window;
     
   
        JLabel Text; //Text variable to display the text in the window
        Window = new JFrame("Text Analyzer"); //Adding the name of the window
        
        //Label to display the text
        Text = new JLabel();
 
        //Text that goes in the label
        Text.setText("Welcome! This program will analyze the occurrences of words in a text file. To run the program, go into the console and press any key.");
 
        //Creating a panel
        JPanel Panel = new JPanel();
 
        //Add the Text label to the panel
        Panel.add(Text);
 
        //Adding the panel to the window
        Window.add(Panel);
 
        //Setting up the size of the window
        Window.setSize(800, 100);
 
        Window.show();
        System.out.println("Waiting for user input");
        System.in.read();//wait for the user to press a key to run the code
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

