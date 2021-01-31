package exercises;
import java.util.Scanner;


public class Carmel {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");

        String name = input.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter the length:");
        double length = input.nextDouble();

        System.out.println("Enter the width:");
        double width = input.nextDouble();
        double Area = length * width;

        System.out.println("The Area of the Rectangle is : " + Area);


        String search = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but it had no pictures" +
                " or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

    }
}
