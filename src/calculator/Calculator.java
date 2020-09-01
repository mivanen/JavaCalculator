/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        
        Scanner scanner = new Scanner(System.in);
              
       
        
        System.out.println("Программа калькулятор.");
        

        System.out.println("First number:");
        double number1=scanner.nextInt(); 
        
        System.out.println("Second number:");
        double number2=scanner.nextInt(); 
        
        System.out.println("Operation: (+ - * / )");
      
        
 
        String znak=scanner.next();
        
        
        double result=0;
        
        if("+".equals(znak))
        {
            result=number1+number2;
        } 
        if("-".equals(znak))
        {
            result=number1-number2;
        } 
        if("/".equals(znak))
        {
            if(number2==0)
            {
                 System.out.println("На ноль делить нельзя!");  
                 result=0;
                 
            }
            else
            {
                result=number1/number2;
            }
            
        } 
        if("*".equals(znak))
        {
            
            result=number1*number2;
        } 
        
        
        System.out.print("Result:");        
        System.out.println(result);     
        
        
        
        
        
    }
    
}
