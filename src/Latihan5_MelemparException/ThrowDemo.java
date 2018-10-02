/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5_MelemparException;

/**
 *
 * @author M. RAFI PUTRA
 */
public class ThrowDemo {
    public static void main(String[] args) {
        String input = "Invalid Input";
        try{
            if (input.equals("Invalid Input")) {
                throw new RuntimeException("Throw Demo");
            }else{
                System.out.println(input);
            }
            System.out.println("After Throwing");
        }
        catch(RuntimeException e) {
            System.out.println("Exception caught here..");
            System.out.println(e);
                    
        }
    }
}
