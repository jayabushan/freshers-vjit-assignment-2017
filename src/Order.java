/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagment;

/**
 *
 * @author Durgesh
 */
public class Order {
    public static int  totalPrice=0;
    public static void setTotalPrice(String price){
       totalPrice = totalPrice + Integer.parseInt(price);
       
    }
    
}
