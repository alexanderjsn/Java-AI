
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        console myConsole = new console(); 
        myConsole.readData();

    }
}


class console {
    public console() {
        Scanner input = new Scanner(System.in);
        System.out.println("User: ");        
        String userInput = input.nextLine();
        System.out.println(userInput);        
        String[] words = splitWords(userInput);
        int randomNumber;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("words.txt", true));
                for (String word : words) {
                Vector<Integer> randomNumbers = new Vector<Integer>();
                for (int i = 0; i < 10; i++) {
                    randomNumber = (int) (Math.random() * 100);
                    randomNumbers.add(randomNumber);
                }
                writer.write("!{ " + word + "}");
                for (Integer num : randomNumbers) {
                    writer.write(":" + num + ":");
                }
                writer.write("!\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   

    private String[] splitWords(String input) {
        return input.split(" ");
    }


   


    public void readData(){

            Map<String,String> wordNumbersMap = new HashMap<>();
    

            try {
                // läser in wordtx - konvert till strings
                BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
                // håller lines så vi kan split + sätta in i array
                // DATA: !{ Hello}:48::14::16::20::83::57::80::0::70::83:!

                String line;
                while ((line = reader.readLine()) != null) {
                    // fyller en array med allt innehåll innanför {} och ::
                    String[] parts = line.split("\\{|\\}:|::|:");
                // DATA: !Hello 48 14 16 20 83 57 80 0 70 83!



                    // om längden på array är med än 1 iterera genom array och skapa en part för varje objekt
                    if (parts.length > 1) {
                        for (int i = 0; i<parts.length; i++) {
                            String part = parts[i];                    
    
                    // om part innehåller ! splitta och sätt in i array
                        String[] groupSplit = part.split("!");
                        // DATA: Hello 48 14 16 20 83 57 80 0 70 83
                        
                        // om längden på array är mer än 1 iterera genom array och sätt in i map
                        for (String group : groupSplit) {
                            // sätter in i en array
                            wordNumbersMap.put(group,part);
                        }       
                    }
                    }
                }
                reader.close();
             } catch (Exception e) {
                e.printStackTrace();
            }
           
} 

class reader {
    public reader() {
    }
}

class ConversationalData {
    public ConversationalData() {
    }
}

class knowledgeBase {
    public knowledgeBase() {
    }
}

class wordData {
    public wordData() {


        int[][] vector1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


    }
}
}