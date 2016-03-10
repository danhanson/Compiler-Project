package lexerIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class startStuff {

    public static void main(String[] args) throws IOException {
        String name = args[0];
        File file = new File(name);
        Scanner s = new Scanner(file);
        String line = s.nextLine();
        int start = 0;
        int length = line.length();
        int curr;
        for(curr = 0; curr < length; curr++){
            char letter = line.charAt(curr);
            if (!Character.isDigit(letter)) {
                String value = line.substring(start, curr);
                if (value.length() > 0) {
                System.out.println(value);
                }
                String type;
                if (letter == '+'){
                    type = "plus";
                }
                else if (letter == '-'){
                    type = "minus";
                } else {
                    type = "Invalid type";
                }
                System.out.println(type);
                start = curr + 1;
            }
        }
        String value = line.substring(start, curr);
        System.out.println(value);
        s.close();
    }

}
