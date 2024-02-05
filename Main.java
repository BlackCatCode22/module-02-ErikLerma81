import java.util.Scanner;
public class Main {
    static void getAnIntFromUser(int num) {
        System.out.println("Your number is " + num);
    }

    static void compareTwoInts(int num1, int num2){
        if (num1 > num2){
            System.out.println(num1 + " is the largest number");
        }
        else{
            System.out.println(num2 + " is the largest number");
        }

    }

    static void sumTwoints(int num1, int num2){
        int total = num1 + num2;
        System.out.println(total + " is the sum of " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        getAnIntFromUser(number);

        System.out.println("Enter 2 Numbers to compare: ");


        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();

        compareTwoInts(numb1, numb2);


        System.out.println("Enter 2 Numbers to get the sum: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        sumTwoints(num1, num2);


    }
}
