import java.util.Scanner;

public class MUlti_Time_Table_11 {
    //input any number and check if it is Armstrong number or not.

        //main method
        public static void main(String[]args){

            //taking different int for method using scanner
            int num, number, temp, total=0;

            //enter any 3 digit number for s.out
            System.out.println("Enter 3 Digit Number");

            //using scanner
            Scanner scanner=new Scanner(System.in);

            //calling num in scanner for method
            num=scanner.nextInt();

            //scanner close
            scanner.close();

            number = num;
            //using for loop that giving 3 digit number is Armstrong number or not
            for ( ;number!=0;number /= 10){
                temp = number % 10;
                total = total + temp*temp*temp;
            }
            //using if-else for total number is equal to number or not
            if (total == num)
                System.out.println(num +"is an Armstrong number");
            else System.out.println(num +"is not an Armstrong number");
        }
    }



