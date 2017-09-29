/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant_Management;
import static hotelmanagment.Code2.listMenu;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 *
 * @author Bushan
 */
public class Restaurant {
    
    public static int tablesPresent = 15;
    public static void main(String args[]) throws InterruptedException,NoSuchElementException, IOException{
        String choice;
        Host host = new Host();
        //Thread.sleep(5000);
        BusBoy busboy = new BusBoy();
        //Thread.sleep(5000);
        //Manager manager = new Manager();
        Server server = new Server();
        //Thread.sleep(5000);
        Manager manager = new Manager();
        
        MasterCheif  cheif = new  MasterCheif();
        //Thread.sleep(1500);
        
         
        
        
        
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code:");
        System.out.println("1:NewCustomer\t\t 2.FeedBack");
        int selection = sc.nextInt();
        if(selection==1)
        {
            if(tablesPresent>=1)
            {
                host.receivesCustomer();
                Thread.sleep(1500);
                host.allocatesTable();
                Thread.sleep(1500);
                tablesPresent=tablesPresent-1;
                busboy.cleansTable();
                Thread.sleep(1500);
                busboy.servesWater();
                Thread.sleep(1500);
                manager.providesMenu();
                hotelmanagment.Menu.listMenu();
                           do{
        System.out.println("Do you want More items:");
        System.out.println("Yes/y || No/n");

           choice = sc.next();
       if("Yes".equals(choice) || "y".equals(choice) | "Y".equals(choice)){
           listMenu();
    }

            } while("Yes".equals(choice) || "y".equals(choice) | "Y".equals(choice));
                Thread.sleep(1500);
                manager.receivesOrder();
                Thread.sleep(1500);
               
               
                
                 cheif.orderToCook();
                Thread.sleep(1500);               
                cheif.cooks();
                Thread.sleep(1500);
                 server.serveFood();
                         
                 Thread.sleep(1500);
                
                System.out.println("Customer request for bill");
                System.out.println("The Total Bill is:" + hotelmanagment.Order.totalPrice);
                System.out.println("Bill paid");
                
            }
                
            }
        
            if(selection==2){
                System.out.println("Customer gives Feedback");
            
            
            
            
            }
        }
         
        
        
        
    
    
    
    
}
