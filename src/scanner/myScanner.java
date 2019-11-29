package scanner;

import java.util.Scanner;

public class myScanner {

    public static void main(String[] args) {

        int qty;
        float price;
        float amount;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter quantity:");
        qty = sc.nextInt();
        
        System.out.println("What is the Price:");
        price = sc.nextFloat();
        
        amount = qty * price;
        
        System.out.println("The total sale is\n" + amount);
        
        sc.close();
        
    }

}


//ScannerClass has diffrent Methods to read diffrent types of Data
//next() reads a string value. If the string value contains white spaces, only
//the first part of the String is read.

//nextLine() reads a string value.

//nextInt() reads an integer number.

//nextFloat() reads an float number.

//nextDouble() reads a double number.

//nextBool() reads a boolean value.

//nextByte() reads a byte number.