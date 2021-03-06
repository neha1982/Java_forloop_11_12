import java.util.Scanner;

public class Rendom_Number_12 {
//a program that generates a random number and asks the user to guess what the number is. If the user's
// guess is higher than the random number, the program should display "Too high, try again.
// " If the user's guess is lower than the random number, the program should display "Too low, try again.
// " The program should use a loop that repeats until the user correctly guesses the random number.
//Usable for AUTOMATION TESTING, to generate random inputs

        /*java.lang.Math class has a random method which generates a decimal value of type double
    which is greater than 0.0 and less than 1.0(0.9999), that is in the range 0.0(inclusive) to 1.0(exclusive).
    This value is different every time the method is invoked.
    In order to generate a number between 1 to 50, we multiply the value returned by random method by 50.
    This makes its range as 0.0 to 49.995. Now add 1 to it.
    This increases its range as 1.0 to 50.995. If this result is cast to an int, the range will be 1 to 50.
    Below program demonstrates this algorithm and shows the result for different executions.
*/

        public static void main(String[] args) {

            double randomDouble= Math.random();
            randomDouble = randomDouble* 50 + 1;
            int randomInt = (int) randomDouble;

            // random number is shown so that user can check how program is working
            System.out.println("Random number generated by system is : "+randomInt);

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            //if random number is not same as user entered number, go in while loop
            while(num!=randomInt){
                if(num<randomInt){
                    System.out.println("Number is too small");
                }
                if(num>randomInt){
                    System.out.println("Number is too big");
                }
                //Getting new input from user and storing in num variable
                num=sc.nextInt();
            }
            // while loop ends when user enters same number as random number
            System.out.println("Number is same");
        }
    }


