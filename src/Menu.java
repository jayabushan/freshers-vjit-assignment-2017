/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;
 
public class Menu1 {
     static HashMap<String,String> map1 =new HashMap<String,String>();
    public static void main(String args[])throws FileNotFoundException,IOException,NoSuchElementException {
       int choice;
       BufferedReader ar = null;
       System.out.println("Enter Your Choice:\n1.Starters\t2.NonVegItems\t3.VegItems");
       Scanner sc = new Scanner(System.in);
       choice = sc.nextInt();
       switch(choice){
           case 1:   ar = new BufferedReader(new FileReader("Starters.txt"));
           break;
            case 2:    ar = new BufferedReader(new FileReader("NonVegItems.txt"));
           break;
           case 3:  ar = new BufferedReader(new FileReader("VegItems.txt"));
           break;
       }
       
         StringTokenizer token;
        String t,token1 = "",token2 = "";
        Menu1 c = new Menu1();
       
        while((t=ar.readLine())!=null){
            token = new StringTokenizer(t," ");
            while(token.hasMoreTokens()){
                token1 = token.nextToken();
                token2 = token.nextToken();
                System.out.println("\nToken1 :" + token1 +"\t" + "Token2 :" + token2);
            }
        map1.put(token1,token2);
    }


    }
    public String getCode(String s){
        if(map1.containsValue(s)){
            for(Map.Entry<String,String>entry:map1.entrySet()){
                if(s.equals(entry.getValue())){
                    return entry.getKey();
                }
            }        
        }
        return null;
    }
    
    
    
}



    


    

