import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
       int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int answer2 = sc.nextInt();
        //here's a hint
        for (int i = 1; i <= answer2; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + answer2 + " is " + factorial);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int answer3 = sc.nextInt();
        int sum = 0;
        int position = 0;
        //No hint! what do you need to complete this task?
        while (answer3 > 0) {
            int digit = answer3 % 10;

        if (position % 2 == 1) {
            sum = sum + digit;
        }
            answer3 = answer3 / 10;
            position++;
        }
        System.out.println("The sum of every other digit is: " + sum);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;

        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        sc.nextLine();
        System.out.println("Enter a word and I will print it backwards: ");
        String answer4 = sc.nextLine();
        //hint
        String reverse = "";
         for (int i = answer4.length() - 1; i >= 0; i--) {
            reverse = reverse + answer4.substring(i, i + 1);
    }
    System.out.println("Your word backwards is: " + reverse);
}
}