package com.careerdevs;


import java.text.NumberFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    final byte MONTHS_IN_YEARS = 12;
    final byte PERCENT = 100;
    int principal =0;
    float monthlyInterest = 0;
    byte years = 0;
    int numberOFPayments = 0;

      Scanner scanner = new Scanner(System.in);
      while (true) {
        System.out.print("Principal: ");
        principal = scanner.nextInt();
        if(principal >= 1000 && principal <= 1_000_000)
          break;
        System.out.println("Enter a value between 1000 and 1000000");
      }

      while (true) {
        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        if (annualInterest >= 1 && annualInterest <= 30) {
        monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEARS;
          break;
        }
        System.out.println("Enter a value between 1 and 30");
      }
      while(true) {
        System.out.println("Period (Years):");
        years = scanner.nextByte();
        if (years >= 1 && years <= 30) {
          numberOFPayments = years * MONTHS_IN_YEARS;
          break;
        }
      }
        //double Mortgage = principal
       //         * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOFPayments));
      // (Math.pow(1 + monthlyInterest, numberOFPayments)-1);

                // String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
       // System.out.println("Mortgage: " + mortgageFormatted);
    }

}

//Mortgage Calculator
//Principal:10000 = Mortgage amount
//Annual Interest Rate 03.92 / by 12 = monthly rate get
//Period(Years):30
//Mortgage: $472.81 * 12 = Annual rate






//shortCuts
//sout/tab (System.out.println)
// shift\f6 (rename/refactor shortcut )


//Primitive :Numbers, Characters, Booleans
//byte(1)[-128-127]
//short(2)[-34k-32k]
//int(4)[-2b -28b]
//long (8) : add L exp{long viewsCount = 3_123_456_789L;}
//float(4) [number with decimals] :add F exp{float price = 10.99F;}
//double[8] [larger number with decimals]
//char [A,B,C] exp{char letter = 'A';}
//boolean [ture/ false] exp{boolean isEligible = false;}

//Reference :Date, Mail Message
//Date now = new Date();
//System.out.println(now);

//String
//String message = "Hello World" + "!!";
//System.out.println( message.endsWith("!!"));
//message.endsWith(message. length())

//Escape String
//add double quote add backlash before quotes
// exp: String message = "Hello \"Mosh\"";
// backlash n\ ()newline
//backlash T\ ()Tab

//unknown Array exp:
//int[] numbers = new int[5];
//numbers[0] =1;
//numbers[1] =2;
//System.out.println( Arrays.toString(numbers));
//Run
//[1, 2, 0, 0, 0]


//2D Array exp
//int [][] numbers = new int [2] [3];
//numbers [0] [0] = 1;
//System.out.println(Arrays.deepToString(numbers));
//Run
//[[1, 0, 0], [0, 0, 0]]

//Get the Remainder in division
//double result = (double)10 / (double)3;
  //      System.out.println(result);

// Implicit Casting
//byte> short> int> long > float> double
// can not cast number to String

//Parse take A String and makes it an integer
//parseInt,parseFloat,parseShort,parseDouble

//exp:
// String x = "1";
//         int y =Integer.parseInt(x) + 2;
//         System.out.println(y);
//Run:3

//Round float number to integer
//exp:
// int result = Math.round(1.1F);
//        System.out.println(result);
//run:1

//math.Floor round to the largest or = integer
//math.ceil rounds to the smallest integer
//math.Max rounds to 2 integer to the largest integer
//math.min rounds to 2 integer to the smallest integer
//math.random any number to 0-1 {double}
//math.random * 100 any number 1-100 {double}

// Random whole number
//int result =(int) Math.round(Math.random() *100);
//System.out.println(result);
//Run: 67

//format integer into currency
//NumberFormat currency = NumberFormat.getCurrencyInstance();
//String result = currency.format( 123456.891);
// System.out.println(result);
//Runs:$123,456.89

//format integer into Percent
// NumberFormat percent = NumberFormat.getPercentInstance();
// String result = percent.format( 0.1);
//System.out.println(result);
//Run: 10%

//(System.in)
//Work in Termainal (nextByte, nextDouble, nextfloat)
//byte age = scanner.nextByte();
//System.out.println("you are" + age);

//Work in Termainal on the same line
// (println is now print)
//exp:
// Scanner scanner = new Scanner(System.in);
// System.out.print("Age: ");
//Run: Age:

//Replace byte w/ String to output a String exp

//NextLine you can add more than one integer
//String name = scanner.nextLine();


