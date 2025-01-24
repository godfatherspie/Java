//By Anshuman Joshi
//Java Lab - Jan 13, 2025 - 11:40am
//Using Buffered Reader to make a basic operations program.


import java.io.*;

class bfreader {
    public static void main(String[] args) {
        double num1, num2, add, sub, mul, div;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter first number: \n");
        try {
            num1 = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.print("Enter second number: \n");
        try {
            num2 = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        add = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        
        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Division is: " + div);
    }
} 