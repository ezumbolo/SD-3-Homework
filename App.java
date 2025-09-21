/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter a word");
        String input = sc.nextLine(); //learned this in class but it takes what the user enters as in this case "input" (nextLine for Strings and nextInt for ints)

       
        for (int i = 0; i < input.length(); i++) { //.length tells you how many characters are in the string. So this loop will keep looping as long as i is less than the total number of letters
            System.out.println(input.substring(i, i + 1)); //will talk abt substring in the write up below cause I had trouble with this line
            
        }
    }
}
//I had to use google and eventually chatgpt to help me with the last line as I couldn't figure it out. But essentially what I learned is that substring takes a part of the string starting at the first parameter given (i in this case) and ending just before the second parameter given (in this case i + 1)
//This works because i starts at 0 (the first letter), and i + 1 (one after i) isn't included as substring doesn't include the end parameter given. So it just prints the first letter. 
//This will then repeat for each letter until every letter is printed out one by one
