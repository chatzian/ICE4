/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ICE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      String word;
      char char1;
      
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
      word= input.next();
        System.out.println("Enter a char");
        char1=input.next().charAt(0);
        
        System.out.println(maxChar(word));
        
    }
    
    
    public static int numOccurence (String word, char char1){
        int count=0;
        for (int i= 0; i<word.length();i++){
            if (word.charAt(i)==char1){
                count++;
            }
        }
        return count;
    }
    
    public static char maxChar(String word){
        ArrayList<Character> list = new ArrayList<Character>();
         for (int i= 0; i<word.length();i++){
           list.add(word.charAt(i));
               
            }
         Collections.sort(list);
         return list.get(list.size()-1);
    }
    
    public static boolean charExist (String word, char char1){
       return word.contains(Character.toString(char1));
    }
}
