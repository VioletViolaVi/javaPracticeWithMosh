public class Main {
    public static void main(String[] args) {
        System.out.println("hi world");
        byte age = 1;
        System.out.println(age);
        int myAge = 15;
        int herAge = myAge;
        System.out.println(herAge);

        /*
            need both "long" and "L" for numbers larger or
            smaller than 2 million or -2 million respectively
        */
        long youtubeViewsCount = 3_123_456_789L;
    }
}
