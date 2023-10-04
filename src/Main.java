import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // print collection by using a consumer lambda fn
        List<Integer> theList = new ArrayList<>();
        theList.add(1);
        theList.add(10);
        theList.add(100);
        Consumer<Integer> printer = x -> System.out.println(x+3);
        theList.forEach(printer);
        System.out.println(
                theList.stream().map(x -> x*x).collect(Collectors.toSet())
        );

        // FOR each
        String hello = "Hello and welcome!";
        for (char letter : hello.toCharArray()) {
            System.out.print(letter);
        }
        System.out.println();

        // REVERSE a string
        char[] letters = hello.toCharArray();
        StringBuilder olleh = new StringBuilder();
        for(int reverseIndex = letters.length - 1; reverseIndex >= 0; reverseIndex--) {
            olleh.append(letters[reverseIndex]);
        }
        System.out.println("v1." + olleh);
        // or
        List<Character> reverseHello = new ArrayList<>(hello.length());
        for (int reverseIndex = hello.length() - 1; reverseIndex >= 0; reverseIndex--) {
            reverseHello.add(hello.charAt(reverseIndex));
        }
        String ollehv2 = reverseHello.stream().map(Object::toString).collect(Collectors.joining());
        System.out.println("v2." + ollehv2);
        // or
        String ollehv3 = Arrays
                .stream(hello.split(""))
                .reduce("", (acc, curr) -> curr + acc);
        System.out.println("v3." + ollehv3);

//        theList.forEach(x -> System.out.print(x));
//        for (int n : theList) {
//            System.out.println(n);
//        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        System.out.println(ints.stream().map(Object::toString).collect(Collectors.joining(".")));

    }
}

// reference:
// https://www.geeksforgeeks.org/stream-in-java/
// playground :: https://dev.java/playground/
// interview :: https://replit.com/@NickBurnett3/Reviews-Processor-Test-Java-OHV