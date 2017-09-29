/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagment;
import java.io.*;
import java.util.*;
/**
 *
 * @author Durgesh
 */
public class Customer extends Code2{
    public static void main(String args[]) throws FileNotFoundException, IOException, InterruptedException{
        String choice;
        System.out.println("Customer Enter the Restaurant");
        Thread.sleep(1000);
        System.out.println("Listing the Menu Items:\n\n");
            listMenu();
            //System.out.println("Below listMenu");
            do{
        System.out.println("Do you want More items:");
        System.out.println("Yes/y || No/n");
        Scanner sc = new Scanner(System.in);
         choice = sc.next();
         //System.out.println("choice is" + choice);
       if("Yes".equals(choice) || "y".equals(choice) | "Y".equals(choice)){
           listMenu();
    }
       //System.out.println("below if condition ");
       //System.out.println("the choice is" + choice);
            } while("Yes".equals(choice) || "y".equals(choice) | "Y".equals(choice));
    
}
}
