import java.util.Scanner;
import java.math.*;
public class first_java {
    public static void main(String[] args) {



//   Q.1)    Write a program to print whether a number is even or odd, also take input from the user.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Number");
//        int a = input.nextInt();
//        if(a%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }


//   Q.2)   Take name as input and print a greeting message for that particular name.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter you Name");
//        String s = input.next();
//        System.out.println("Hello " + s);


//   Q.3)   Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the Principal Amount:");
//        double p = input.nextDouble();
//        System.out.print("Enter the Time in Years: ");
//        int t = input.nextInt();
//        System.out.print("Enter the Annual Interest Rate percentage : ");
//        double r = input.nextDouble();
//        System.out.print("Final Amount is : "+ p*(1+t*(r/100)));


//   Q.4)   Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Calculator, Which Operation you Want to Perform");
//        System.out.println("1.) Addition");
//        System.out.println("2.) Subtraction");
//        System.out.println("3.) Multiplication");
//        System.out.println("4.) Division");
//        float t = input.nextInt();
//        System.out.print("Enter the First Number : ");
//        float first = input.nextFloat();
//        System.out.print("Enter the Second Number : ");
//        float second = input.nextFloat();
//        if(t==1){
//            System.out.println(first+second);
//        }
//        else if(t==2){
//            System.out.println(first-second);
//        }
//        else if(t==3){
//            System.out.println(first*second);
//        }
//        else if(t==4){
//            System.out.println(first/second);
//        }
//        else{
//            System.out.println("This Operation is not in the Calculator");
//        }


//   Q.5)   Take 2 numbers as input and print the largest number.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the First Number");
//        float a = input.nextFloat();
//        System.out.println("Enter the Second Number");
//        float b = input.nextFloat();
//        if(a>b){
//            System.out.println("First Number is bigger than the Second");
//        }
//        else if(a<b){
//            System.out.println("Second Number is bigger than the First");
//        }
//        else{
//            System.out.println("Both are Equal");
//        }


//   Q.6)   Input currency in rupees and output in USD.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Amount in Rupees");
//        float a = input.nextFloat();
//        System.out.println("The Amount in USD is:  " +a/81.5 );

//   Q.7)   To calculate Fibonacci Series up to n numbers.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Number to find the fibonacci series of it");
//        int n = input.nextInt();
//        int a =0;
//        int b =1;
//        System.out.print(a+" "+b);
//
//        for(int i=2; i<n; i++){
//            int c = a+b;
//            System.out.print(" "+c);
//            a = b;
//            b = c;
//        }


//   Q.8)   To find out whether the given String is Palindrome or not.


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the String to check if it is palindrome");
//        String s = input.next();
//        int k = s.length();
//        int l = 0;
//        for(int i=0; i<(k/2); i++){
//            if(s.charAt(i)== s.charAt(k-1-i)){
//                l+=1;
//            }
//
//        }
//        if(l==(k/2)){
//            System.out.println("It is Palindrome");
//        }else{
//            System.out.println("Not a Palindrome");
//        }


//   Q.9)   To find Armstrong Number between two given number.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Upper Limit ");
//        int first = input.nextInt();
//        System.out.println("Enter the Lower Limit ");
//        int second = input.nextInt();
//
//        for(int i=first; i<second; i++){
//            int x = i;
//            int n = 0;
//            while(x!=0){  // Integer Digit Counting
//                x /= 10;
//                n++;
//            }
//
//            int power_sum = 0;
//            x = i;
//            while(x!=0){
//                int digit = x%10;
//                power_sum += Math.pow(digit, n);
//                x /= 10;
//            }
//
//            if(power_sum == i){
//                System.out.println(i+ " ");
//            }
//
//        }
    }
}






