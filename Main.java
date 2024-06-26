
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   

    private String[] splitWords(String input) {
        return input.split(" ");
    }

    public void readData() {
        Map<String, List<String>> wordNumbersMap = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Split each line by "!:"
                String[] groups = line.split("!");
                
                for (String group : groups) {
                    if (!group.trim().isEmpty()) {
                        // Remove the starting '{' and split by '}'
                        group = group.substring(1);
                        String[] parts = group.split("\\}");

                        if (parts.length == 2) {
                            String key = parts[0].trim();
                            String[] values = parts[1].split(":");

                            List<String> valueList = new ArrayList<>();
                            for (String value : values) {
                                if (!value.trim().isEmpty()) {
                                    valueList.add(value.trim());
                                }
                            }
                            wordNumbersMap.put(key, valueList);
                        }
                    }
                }
            }
            reader.close();
            
            for (Map.Entry<String, List<String>> entry : wordNumbersMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Values: " + entry.getValue());
            }    
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
