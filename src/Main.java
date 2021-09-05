import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Primitive data types
        System.out.println("hi world");
        byte age = 1;
        System.out.println("age: " + age);
        int myAge = 15;
        int herAge = myAge;
        System.out.println("herAge: " + herAge);
        /*
            need both "long" and "L" for numbers larger or
            smaller than 2 million or -2 million respectively
        */
        long youtubeViewsCount = 3_123_456_789L;
        /*
            need both "float" and "F" for
            numbers with 6 to 7 decimal digits
        */
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        char letter1 = 'T';
        char letter2 = letter1;
        System.out.println("letter1: " + letter1);
        System.out.println("letter2: " + letter2);
        letter1 = 'U';
        System.out.println("letter2: " + letter2);
        System.out.println("letter1: " + letter1);

        System.out.println("\n");

        // Reference data types
        Date now = new Date();
        System.out.println("now: " + now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);

        point1.x = 5;
        point1.y = 5;
        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);

        System.out.println("\n");

        // Strings
        String message = "     Hi there world" + "!!!!!             ";
        System.out.println("message: " + message);
        System.out.println("message.endsWith(\"!!\"): " + message.endsWith("!!"));
        System.out.println("message.endsWith(\"Nice to see ya!\"): " + message.endsWith("Nice to see ya!"));
        System.out.println("message.startsWith(\"!!\"): " + message.startsWith("!!"));
        System.out.println("message.length()): " + message.length());
        System.out.println("message.isBlank(): " + message.isBlank());
        System.out.println("message.indexOf(\"there\"): " + message.indexOf("there"));
        System.out.println("message.indexOf(\"l\"): " + message.indexOf("l"));
        System.out.println("message.replace(\"Hi\", \"BYE\"): " + message.replace("Hi", "BYE"));
        System.out.println("note the message string variable didn't change 'cause strings are immutable :) = " + message);
        System.out.println("message.toLowerCase(): " + message.toLowerCase());
        System.out.println("message.toUpperCase(): " + message.toUpperCase());
        System.out.println("message.trim(): " + message.trim());
        System.out.println("note the message string variable STILL didn't change 'cause strings are immutable :D = " + message);

        System.out.println("\n");
    }
}
