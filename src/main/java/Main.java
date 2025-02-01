import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declare Variable
        double income = 0.0;
        double taxRate = 0.0;

        //Prompt user income input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weekly income: $");
        income = scanner.nextDouble();

        //Selection structures with tax withholding bracket
        if (income < 500) {
            taxRate = 0.10;
        } else if (income >= 500 && income < 1500) {
            taxRate = 0.15;
        } else if (income >= 1500 && income < 2500) {
            taxRate = 0.20;
        } else if (income >= 2500) {
            taxRate = 0.30;
        }

        //tax withheld calculation
        double taxWithheld = income * taxRate;


        //Print Results
        System.out.println("Your weekly income: $" + income);
        System.out.println("Tax rate: " + (taxRate * 100) + "%");
        System.out.println("Tax withheld: $" + taxWithheld);

        //Close Scanner
        scanner.close();
    }
}
