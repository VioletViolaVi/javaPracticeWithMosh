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
    }
}
