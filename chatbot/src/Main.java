import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is LULUBOT.");
        System.out.println("I was created in 2024.");

        System.out.println("Please, remind me your name.");
        String name1 = scanner.nextLine();
        System.out.println("What a great name you have, "+name1+"!");

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7."); //2,1,5 for an example
        Double remainder3 = scanner.nextDouble();
        Double remainder5 = scanner.nextDouble();
        Double remainder7 = scanner.nextDouble();
        Double age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %.2f; that's a good time to start programming!",age);

        System.out.println("Now I will prove to you that I can count to any number you want.");
        int inputNum = scanner.nextInt();
        for(int i =0; i<= inputNum;i++){
            System.out.println(i+"!");
        }
        System.out.println("Completed, have a nice day!");

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int feebackInput = 1;
        int correctAwn = 4;
        for(int i = feebackInput;i != correctAwn;){
            i = scanner.nextInt();
            if(i == 4){
                System.out.println("Congratulations, have a nice day!");
            }
            else{
                System.out.println("Please, try again.");
            }
        }
    }
}