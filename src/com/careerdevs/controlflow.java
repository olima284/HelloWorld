package com.careerdevs;

import java.util.Locale;
import java.util.Scanner;

public class controlflow {
    public static void main(String[] args) {

    }
}




//control flow
//1)control flow is one of the fundamental features of Java, which provides a smooth flow of program.

//2) the code are executed according to the order in which they appear "from top to bottom
//3)Java provides three types of control flow statements.

//Decision Making statements
//if statements
//switch statement

//Loop statements
//do while loop
//while loop
//for loop
//for-each loop

//Jump statements
//break statement
//continue statement

//Comparison Operators

//int x = 1;
//int y = 1;
//System.out.println(x == y);true
//in this expression x and y have the same vaule so (x ==(equal too) y)
//so Boolean is true


// (x != y) false
//(xless than< / >more than>)
// (x y)
//Boolean value  can only be True or false



 //logical Operators

//(&&(is the and)"And" Operator")
// second condition is not evaluated if the first one is false

//(if )Condition1 && Condition2
// returns true if both the conditions are true.

//int temperature = 22;
//  boolean isWarm = temperature > 20 && temperature < 30;
//  System.out.println(isWarm);

// false temp is below 20 - && Operators will ignore other
//expressions //( "&&" )only true if both expressions are both true

//(|| Or Operators)
//if(!carStorage[i].isRented())

//Condition1 || Condition2

// returns true if one of the conditions is true.
//boolean hasHighIncome = true;
//boolean hasGoodCredit = true;
//boolean hasCriminalRecord = false;
//boolean isEligible = (hasHighIncome || hasGoodCredit && !hasCriminalRecord);
//Or (||) is true if at least one condition is true
// once you add && !hasCriminalRecord (! is not  operator)
// the condition is now false



//IF Statements
//1)if temp is greater than 30 = its a hot day"drink water
//2)otherwise if its between 20 and 30 "It's a nice day "
//3)otherwise "its cold "

//int temp = 32;
//        if (temp > 30 ) {
//              System.out.println("It's have a nice day");
//              System.out.println("Drink water");
//        } else if (temp > 20 && temp >= 30) {
//             System.out.println("beautiful day");
//        } else
//             System.out.println("cold day");

//Simplifying IF Statements

    //remove extra curly braces ({}) remove from else and if else
    //remove (&& temp >= 3) no need to repeat
    //line up code so its easier to reaad
//    int temp = 32;
//      if (temp > 30) {
//              System.out.println("It's have a nice day");
//              System.out.println("Drink water");
//              }
//              else if (temp > 20 )
//              System.out.println("beautiful day");
//              else
//              System.out.println("cold day");


//conditional Statements

//Ternary

// "Economy = income under 100_000"
// "First = income equal to or over 100_000"
// only conditional operator that takes three operands
// one=liner replacement for if-then-else statement
//variable = Expression1 ? Expression2: Expression3
//Exression2 is executed if Expression1 is true else Expression3 is executed.

//   int income = 120_000;
//  String className = income > 100_000 ? "First" : "Economy" ;

//Switch Statments

// switch statement can have a number of possible execution paths.
// switch statements work with byte, int, short, char, Sting and other primitive data types
//String role = "admin";
//      switch (role){
//              case "admin":
//              System.out.println("You're an admin");
//              break;
//
//              case "moderator":
//              System.out.println("You're a moderator");
//              break;
//
//default:
//        System.out.println("You're a guest");
//        }
////EXP of the IF Statement used in Switch Statement
//        if (role == "admin")
//        System.out.println( "You're an admin");
//        else if (role == "moderator")
//        System.out.println("You're a moderator");
//        else
//        System.out.println("You're a guest");


//Exercise FizzBuzz

//      Scanner scanner = new Scanner(System.in);
//      System.out.print("Number: ");
//      int number = scanner.nextInt();
//
//      if (number % 5 == 0 )
//      System.out.println("Fizz");
//      else if (number % 3 == 0)
//          System.out.println("Buzz");
//      else if ( number % 5 == 0 && number % 3 == 0)
//          System.out.println("FizzBuzz");
//      else
//          System.out.println(number);

// the more pacific statement should always be first because it
// If the simpler statement are ture it will be ignored
// Do not repeat your self
//
//      Scanner scanner = new Scanner(System.in);
//
//      System.out.print("Number: ");
//
//      int number = scanner.nextInt();
//
//      if ( number % 5 == 0) {
//          if ( number % 3 == 0 )
//          System.out.println("FizzBuzz");
//          else
//              System.out.println("Fizz");
//      }
//     else if (number % 3 == 0)
//          System.out.println("Buzz");
//      else
//          System.out.println(number);
//



//Loops
//for loop the number of iterations to be done is already known
// (i) is always start at 0


//     for (int i = 0; i < 5; i++)
//         System.out.println("Hello World ");
//runs: hello world
//      hello world
//      hello world
//      hello world
//      hello world

//        for (int i = 1; i <= 5; i++)
//         System.out.println("Hello World " + i );
//runs:
//Hello World 1
//Hello World 2
//Hello World 3
//Hello World 4
//Hello World 5

// To count backwards with a For-loop i must = 5 and 5 must be greater than 0 and i++ should be i--

//     for (int i = 5; i > 0; i--)
//              System.out.println("Hello World " + i );
//runs:
//Hello World 5
//Hello World 4
//Hello World 3
//Hello World 2
//Hello World 1


//While loops

//while loop the command runs until a certain condition is reached and the statement is proved to be false.
//      for (int i = 5; i > 0; i--)
//            System.out.println("Hello World " + i );

//Rewrite code using While-loops
//      int i = 0
//      while (i > 0) {
//          System.out.println("Hello World " i);
//          i--;
//      }


//Running While-loop
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while(input.equals("quit")) {
//        System.out.println("Input: ");
//        input = scanner. next().toLowerCase();
//        System.out.println(input);
//        }

//Runs into user inputs quit

//Do... While-Loops
// do-while loop  tests the loop continuation condition after the first iteration has completed
//  Do While executes the statements in the code block at least once even if the condition Fails.
//Scanner scanner = new Scanner(System.in);
//    String input = "";
//        while(input.equals("quit")) {
//                System.out.println("Input: ");
//                input = scanner.next().toLowerCase();
//                System.out.println(input);
//                }
//// REWRITE USING DO... While -Loops
//                do {
//                System.out.print("Input: ");
//                input = scanner.next().toLowerCase();
//                System.out.println(input);
//                } while(input.equals("quit"));

    //Break and Continue
//  using While (true) make sure statement always has break or you will have an infinite loop
// continue statement is used to skip the current iteration of the loop.
// break statement is used to terminate the loop immediately

//Scanner scanner = new Scanner(System.in);
//    String input = "";
//        while(true) {
//                System.out.println("Input: ");
//                input = scanner.next().toLowerCase();
//                if(input.equals("pass"))
//                continue;
//                if(input.equals("quit"))
//                break;
//                System.out.println(input);
//                }

//Foreach -Loop
//        difference between for Loop and foreach loop is that the for loop is a general purpose control structure while the foreach loop is an enhanced for loop that is applicable only to arrays and collections
//String[] fruits = {"Apple", "Mango", "Orange"};
//
//        for(int i = 0; i < fruits.length; i++)
//            System.out.println(fruits);

// using Foreach-Loop
//        for (String fruit : fruits)
//            System.out.println(fruits);


