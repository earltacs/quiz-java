/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;
import java.util.Scanner;
public class Quiz1 {
    public static double length, width, height;
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Which do you need?(Area, Perimeter, Volume)");
        String op = in.next();
        if(op.equalsIgnoreCase("Area") == true){area();}
        else if(op.equalsIgnoreCase("Perimeter") == true){perimeter();}
        else if(op.equalsIgnoreCase("Volume") == true){volume();}
        else{System.exit(0);}
    }
    public static void area(){
        System.out.println("Enter length of the rectangle(2 decimal places)");
        length = in.nextDouble();
        System.out.println("Enter width of the rectangle(2 decimal places)");
        width = in.nextDouble();
        System.out.printf("The area of the rectangle is: %.2f\n", length * width);
    }
    public static void perimeter(){
        System.out.println("Enter length of the rectangle(2 decimal places)");
        length = in.nextDouble();
        System.out.println("Enter width of the rectangle(2 decimal places)");
        width = in.nextDouble();
        System.out.printf("The perimeter of the rectangle is: %.2f\n", (length*2)*(width*2));
    }
    public static void volume(){
        System.out.println("Enter length of the rectangle(2 decimal places)");
        length = in.nextDouble();
        System.out.println("Enter width of the rectangle(2 decimal places)");
        width = in.nextDouble();
        System.out.println("Enter height of the rectangle(2 deimal places)");
        height = in.nextDouble();
        System.out.printf("The volume of the rectangle : %.2f\n", length*width*height);
    }
}
