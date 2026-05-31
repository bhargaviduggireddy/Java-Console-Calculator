import java.util.Scanner;
public class Calculator{
    public static double add(double a,double b){
        return a + b;
    }
    public static double subtract(double a,double b){
        return a - b;
    }
    public static double multiply(double a,double b){
        return a * b;
    }
    public static double divide(double a,double b){
        if (b == 0){
            System.out.println("Error:Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int choice = 0;;

        System.out.println("===welcome to the Java Console Calculator ===");
    do {
        System.out.println("\nSelect an operation:");
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");

        System.out.print("Enter your choice: ");
        if (!sc.hasNextInt()){
            System.out.println("Invalid input! please enter a number between 1 and 5.");
            sc.next();
            continue;
        }
        choice = sc.nextInt();

        if (choice >=1 && choice <=4){
            System.out.print("Enter first number: ");
            while (!sc.hasNextDouble()){
                System.out.print("Invalid number! Enter a valid first number:");
                sc.next();
            }
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            while (!sc.hasNextDouble()){
                System.out.print("Invalid number! Enter a valid second number:");
                sc.next();
            }
            double num2 = sc.nextDouble();

            switch (choice){
                case 1:
                    System.out.println("Result =" + num1 + " + " + num2 + " = " + add(num1,num2));
                    break;
                case 2:
                    System.out.println("Result =" + num1 + " - " + num2 + " = " + subtract(num1,num2));
                    break;
                case 3:
                    System.out.println("Result ="+ num1 + " * " + num2 + " = " + multiply(num1,num2));
                    break;
                case 4:
                    System.out.println("Result =" + num1 + " / " + num2 + " = " + divide(num1,num2));
                    break;
            }
        }else if (choice !=5){
            System.out.println("Exiting the calculator.Goodbye!");
        }else{
            System.out.println("Invalid Choice!");
        }

        }while (choice != 5);

           sc.close();
     }
  }
