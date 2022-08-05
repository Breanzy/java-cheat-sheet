import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;


public class Main
{

    public static class temp
    {

        public temp()
        {
            this.bilat = null;
        }
        
        private String bilat = null;


        public String getBilat() {
            return bilat;
        }

        public void setBilat(String bilat)
        {
            this.bilat = bilat;
        }
    }


    public static void main(String[] args)
    {
        //  String test = "me0012.0";
        // String moreTest[] = test.split("(?<=\\D)(?=\\d)", 2);

        // String name = moreTest[0];
        // double a = Double.parseDouble(moreTest[1]);
        
        // if(name.equals("FUCK"))
        // {
        //     System.out.print("lmao");
        // }

        // else if(name.equals("me"))
        // {
        //     System.out.print("aye");
        // }


        // int[] fuck = new int[10];
        // int aye = 0;

        // for (int i : fuck) 
        // {
        //     System.out.println(aye);
        //     aye++;
        // }

        
        // temp alsfh = new temp();
        // alsfh.setBilat("GAGU");
        
        // if(alsfh.getBilat().equals("GAGU"))
        //     System.out.print("aye");

            Scanner s = new Scanner(System.in);

            String a = s.nextLine();
            System.out.print(a);
         
    }



//    Takes an int input, shows all the strict divisors of it and adds all those numbers
//    Example:
//    Input = 10, Output = Strict Divisors: 1 2 5  Total: 8.
//    Input = 49, Ouptut = Strict Divisors: 1 7    Total: 8.
    public static void moduloExample1()
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Input: ");
            int i = s.nextInt();

            int sum = 0;

            System.out.println("Strict Divisors: ");
            for(int a = 1; a <= i/2; a++)
            //for the condition in the for loop, it is i/2 because all strict divisors are only within HALF of the number itself.
            //the number 6 has 3 as the greatest factorable number (6/2) besides the number 6 itself.
                if(i % a == 0)
                    //Every iteration checks if the current value of a is a strict divisor and prints it if so.
                    System.out.print(a + "\t");

            for(int a = 1; a <= i/2; a++)
                //This is a MEGA FLEX with just a single liner with a hell of a lot of shit going on.
                //I mean i literally created a separate for loop for it instead of merging it
                //to the previous loop JUST so I can show how fucking cool this is.
                sum += i % a == 0 ? a : 0;
                //anyway, notice (i % a == 0 ? a : 0) and how it is the same with (if(i % a) sum = a; else sum = 0;)
                //NOTICE HOW FUCKING EFFICIENT AND COOL AS SHIT THAT WAS MY GUY
                //also, notice (+=) meaning sum = sum + (If the condition is right) a;
                //DID I MENTION ALL THESE SHITS ARE DONE IN A SINGLE FUCKING LINE??!?!?!!! AND ITS EVEN SHORT AT THAT HOLY FUCKK

            System.out.println("\nTotal of all strict divisors of " + i + ": " + sum);
            
            s.close();
        }

// Takes an int input and adds all the individual digits.
// Also shows another way of using Scanner methods.
// Example:
// Input = 1234, Output = 10.
// Input 123456, Output = 21.
    public static void moduloExample2AndSpecialScannerUse()
        {
            System.out.print("Input: ");
            int i = new Scanner(System.in).nextInt();

            //Notice how it no longer initializes a variable to create a scanner and just immediately jumps to scanning
            //for the value of i. This shortcut is efficient when you only need to use the scan function once or twice.
            //Otherwise, you'd be spamming new Scanner(System.in).whateverFunction(); everytime you call a scanner.

            int size = 0;

            while(i > 0)
                {
                    //using modulo 10 here means you get the value of the very last digit. 101 % 10 = 1 or 2154235 % 10 = 5.
                    size += i % 10;
                    //dividing by 10 in an int variable means you are cutting the last digit. 154 / 10 = 15 or 3451 / 10 = 345.
                    i /= 10;
                    //also notice how it is /=. +=, -=, *=, /= are essentially x = x (operator) y.
                }

            System.out.println("Total: " + size);


        }

    //Checks if input string is a palindrome
    public static void palindrome()
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Input: ");
            String i = s.nextLine();

            boolean isPalindrome = false;

            //You can apparently define multiple variables in the first parameter of for loop. Very cool.
            for (int a = 0, size = i.length(); a < size; a++)
                isPalindrome = i.charAt(a) == i.charAt(size - a - 1) ? true : false;
                //A great example of "not all one liners are good" I mean look at this garbage. ew.
                //You cannot understand what the fuck is going on. The point of doing these kinds of things
                //is to make lines of code beautiful to look at AND therefore easier to understand. This shit here
                //defeats its purpose other than to just assert dominance.

                System.out.println(isPalindrome ? "The shit you input is a palindrome" : "The shit you input is not a palindrome");
        }

    //A pretty kewl substitution for for loops
    public static void forEachExample()
        {
            //This is a pretty basic example, I only saw this in a website research
            int[] A = {1, 2, 3, 4, 5};

            //the "int numbers" part is the data type of the array, and numbers represents the individual data within it.
            //This ultimately means that this variation of for loop is only applicable to arrays
            for (int numbers : A)
                System.out.println(numbers);

        }


    public static void scannerTips()
    {
        Scanner s = new Scanner(System.in);

        //Scan for char
        System.out.print("Input for a (Int): ");
        char a = s.nextLine().charAt(0);

        System.out.print("Input for b (Int): ");
        int b = s.nextInt();
        s.nextLine();
        //See that extra s.nextLine();? That's for .nextInt();
        //Remember scanf in c and there's this instance where some shits fuck up? It happens in Java too.
        //Every time you follow up another scanner with a .nextInt or whatever, always put an extra .nextLine();.
        //so it won't fuck up. Try disabling that line of code, see what happens lmao

        System.out.print("Input for c (String): ");
        String c = s.nextLine();

        System.out.println(a + " " + b + " " + c);
    }

    //Uses the the Random class in java
    static void Randomizer()
    {
        Random randomizer = new Random();

        System.out.println("How many cool ass numbers do you want: ");
        int a = new Scanner(System.in).nextInt();

        for (int b = 0; b < a; b++)
            System.out.println(randomizer.nextInt((420 - 69) + 1) + 69);
    }







//Functions that don't need much explanation but would be a waste if i just deleted it
    //Shows Fibbonachi Sequence in the nth order.

    public static void fibonacchiSequence()
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Input: ");
            int a = s.nextInt();

            int c = 0;
            int b = 1;
            int oldB = 0;
            for(int d = 0; d < a-1; d++)
                {
                    oldB = b;
                    b += c;
                    c = oldB;
                }
            System.out.println("The value of sequence " + a + " in the fibonacchi sequence is: " + b);
        }
    //Makes a string  a e s t h e t i c   a s   f u c k

    public static void aestheticEffect()
        {
            Scanner s = new Scanner(System.in);
            System.out.print("Input: ");
            String i = s.nextLine();

            for (int a = 0; a < i.length(); a++)
                System.out.print(i.charAt(a) + " ");
        }


}

