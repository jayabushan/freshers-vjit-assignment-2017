/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagment;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home Pc
 */
import java.util.HashMap;
import java.util.*;
import java.io.*;
 
public  class Code2 {
     static HashMap<String,String> map1 =new HashMap<String,String>();

    public static void listMenu() throws FileNotFoundException,IOException,NoSuchElementException {
       int choice;
       int i=0;
       BufferedReader ar = null;
       System.out.println("Enter Your Choice:\n1.Starters\t2.Main\t3.Desserts");
       Scanner sc = new Scanner(System.in);
       choice = sc.nextInt();
       switch(choice){
           case 1:   ar = new BufferedReader(new FileReader("starter.txt"));
           break;
            case 2:    ar = new BufferedReader(new FileReader("Main.txt"));
           break;
           case 3:  ar = new BufferedReader(new FileReader("desserts.txt"));
           break;
       }
         StringTokenizer token;
        String t,token1 = "",token2 = "";
        Code2 c = new Code2();
        while((t=ar.readLine())!=null){
            token = new StringTokenizer(t," ");
            while(token.hasMoreTokens()){
                i++;
                token1 = token.nextToken();
                token2 = token.nextToken();
                System.out.println("\n" + i +":Item :" + token1 +"\t" + "Price :" + token2);
            }
        map1.put(token2,token1);
	
    }
	i=1;
	System.out.println("Enter your Choice From List :");
	int ch = sc.nextInt();
        BufferedReader br=null;
        if(choice == 1){
             br = new BufferedReader(new FileReader("Starter.txt"));
            
        }else if(choice == 2){
            br = new BufferedReader(new FileReader("main.txt"));
        }else if(choice == 3){
           br = new BufferedReader(new FileReader("desserts.txt"));
        }
        while((t=br.readLine())!=null){
            //System.out.println("i value is" + i +" ch value is " + ch);
            token = new StringTokenizer(t," ");
            //System.out.println("below token Stringtokenizer");
            while(token.hasMoreTokens()){
                //System.out.println("in While loop");
                if(i == ch){
                    token.nextToken();
                    Order.setTotalPrice(token.nextToken());
                    break;
                }
                else{
                    token.nextToken();
                    token.nextToken();
                }
                    
            }
            i++;
        }

    }

    
}



    

