import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        System.out.print("Enter a word: ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.print("Your word backwards is: ");

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));

        }
    }
}