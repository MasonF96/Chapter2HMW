
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class CookieCalories {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Get the number of cookies ate
        System.out.println("How many cookies did you eat?");
        
        int numberofcookies= keyboard.nextInt();
        
        //calculate serving size 
        // 40 cookies and 10 servings in one bag, #4 is serving size 
        float servingsize = numberofcookies / 4;
        
        //Calculate calories
        float caloriesate = servingsize * 300;
        
        //ouptut number of calories ate
        System.out.println("The number of calories ate from cookies is " + caloriesate);
    }
}
