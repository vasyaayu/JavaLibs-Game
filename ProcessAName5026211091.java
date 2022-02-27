package processingname;

import java.util.Scanner;


public class ProcessAName5026211091 {
    
    
    public static Scanner user_input;
    public static void main(String[] args) {
        user_input = new Scanner(System.in);
        System.out.print("Type your name: ");
        System.out.println("Your name is: "+changeNameFormat(user_input.nextLine()));
    }
    public static String changeNameFormat(String input) {
        String firstName, lastName, initial;
        firstName = input.substring(0, input.indexOf(" "));
        lastName = input.substring(input.indexOf(" ")+1, input.length());
        initial = firstName.substring(0, 1);
        return lastName + ", " + initial;
    }
}