import java.util.Scanner;
public class LargestOfThree {


    static void ThreeNumbers (int num1, int num2, int num3){
        int largest = 0;
        if (num1 > num2 && num1 > num3){
            largest = num1;
        }
        if (num2 > num1 && num2 > num3){
            largest = num2;
        }
        if (num3 > num1 && num3 > num2){
            largest = num3;
        }

        System.out.print("Largest number of the 3 is " + largest);
    }

    public static void main(String[] args) {
        System.out.println("Enter 3 Numbers: ");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        ThreeNumbers(num1, num2, num3);





    }
}
