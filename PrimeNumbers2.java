/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.numbers.pkg2;

/**
 *
 * @author admin
 */
public class PrimeNumbers2 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args){
        
        int remainder;
        int CheckNumber= 25;
        boolean isPrime=true;
        //loop 
        for( int k=2;k<=CheckNumber/k;k++){
          remainder=CheckNumber%k;
          System.out.println("divided by:" + k + "remainder is :"+ remainder );
          
          if (remainder==0){
              isPrime=false;
             
          }}
        if(isPrime){
            System.out.println("CheckNumber:"+CheckNumber+" Number is Prime:" + isPrime);
        }else
            System.out.println("CheckNumber is :"+CheckNumber+ " Number is not Prime:" + isPrime);
    }
    }