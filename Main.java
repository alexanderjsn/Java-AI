
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        console myConsole = new console(); 
    }
}

class console {
    public console() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");        
        String name = input.nextLine();
        System.out.println("Hello, " + name);
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
    }
}
