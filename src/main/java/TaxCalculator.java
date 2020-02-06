
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
public class TaxCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Prompt user for price.
        System.out.println("How much does the item cost?");

        //Get price from use.
        double cost = keyboard.nextInt();

        //Calculate state tax
        double statetaxtotal = cost * 0.02;

        //Output State tax
        System.out.println("State tax for purchase: " + statetaxtotal);

        //Calculate county tax
        double countytaxtotal = cost * 0.04;

        //Outpux county tax
        System.out.println("County tax for purchase: " + countytaxtotal);
        
        //Calculate Total sales tax
        double totalsalestax = cost + statetaxtotal + countytaxtotal;
        
        //Output total sales tax
        System.out.println("Total for the transastion is: " + totalsalestax);
        
                
    }

}
